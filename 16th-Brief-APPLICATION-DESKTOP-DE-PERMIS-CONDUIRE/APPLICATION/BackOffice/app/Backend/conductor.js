// Display all constractor
$(function () {
    var $getContructor = $('#getContructor');

    $.ajax({
        type: 'GET',
        url: 'http://localhost:8081/Conducteur',
        success: function (getContructor) {
            $.each(getContructor, function (i, row) {
                $getContructor.append(`
        <tr>
        <td>${row.Matricule}</td>
        <td>${row.Nom}</td>
        <td>${row.Prenom}</td>
        <td>${row.Email}</td>
        <td>${row.Telephone}</td>
        <td>${row.Adresse}</td>
        <td>${row.Numero_du_Permis}</td>
        <td>${row.Nombre_de_Point}</td>
        <td class="text-center py-0 align-middle">
        <div class="btn-group btn-group-sm">
            <button class="btn btn-primary" onclick="updateConstractor('${row._id}')" type="button" >
            Edite
          </button>
        </div>
    </td>
      </tr>

        `)
            });
        }
    });

})

// add new constractor 
$('#add_Conducteur').on('click', function (e) {
    var $Matriculefild = $('#Matriculefl');
    var $Nomfild = $('#Nomfl');
    var $Prenomfild = $('#Prenomfl');
    var $Emailfild = $('#Emailfl');
    var $Telephonefild = $('#Telephonefl');
    var $Adressefild = $('#Adressefl');
    var $Numero_du_Permisfild = $('#Numero_du_Permisfl');
    var $Nombre_de_Pointfild = $('#Nombre_de_Pointfl');
    if ($Matriculefild.val() == "" || $Nomfild.val() == "" || $Prenomfild.val() == "" || $Emailfild.val() == ""||
    $Telephonefild.val() == "" || $Adressefild.val() == "" || $Numero_du_Permisfild.val() == "" || $Nombre_de_Pointfild.val() == ""
    ) {
        alert("please make sure that you fill out all the fill!!");
        e.preventDefault();
    } else {

        $.post('http://localhost:8081/Conducteur/Add',
                    data= {
                Matricule: $Matriculefild.val(),
                Nom: $Nomfild.val(),
                Prenom: $Prenomfild.val(),
                Email: $Emailfild.val(),
                Telephone: $Telephonefild.val(),
                Adresse: $Adressefild.val(),
                Numero_du_Permis: $Numero_du_Permisfild.val(),
                Nombre_de_Point: $Nombre_de_Pointfild.val()
            },
            success= function () {
                alert("Your Info Added");
                location.href = "index.html"
            });

    }
});

// Login if admin/conductor 
$('#login_conductor').on('click', function (e) {
    var $Usernamefild = $('#Username');
    var $Passfild = $('#pass');

    if ($Usernamefild.val() == "" || $Passfild.val() == "") {
        alert("please make sure that you fill out all the fill!!");
        e.preventDefault();
        } else {

        $.post('http://localhost:8081/Admins/login',
                    data= {
                        Login: $Usernamefild.val(),
                        Password: $Passfild.val()
            },
            success= function (response) {
                console.log(response)
                if(response.res == "YES"){
                    alert("Enjoy");
                    location.href = "dashboard-admin.html"
                }else{
                    alert("Invalid username and password!");
                }
            }
        )}
});


function updateConstractor(_id) {
    var $Nombre_de_Pointfild = $('#Nombre_de_Pointfl');

    $.ajax({
        method: 'PUT',
        url:`http://localhost:8081/Conducteur/update/${_id}`,
        data: {
            Nombre_de_Point: $Nombre_de_Pointfild.val()
        },
        success: function (data) {

            // location.reload();
        }
    })
}

$('#Check').on('click', function (e) {

    var $Matricule= $('#Matriculefld');
    var $getContructor = $('#getContructorbtmat');

    if ($Matricule.val() == "") {
        alert("Matricule file is empty");
        e.preventDefault();
    } else {
        // Matricule = Matricule2.val();
        $.ajax({
            type: 'GET',
            url: `http://localhost:8081/Conducteur/${Matricule}`,
            data= {
                Matricule: $Matricule.val()
    },
            success: function () {
        $getContructor.append(`
            <tr>
            <td>${getContructor.Matricule}</td>
            <td>${getContructor.Nom}</td>
            <td>${getContructor.Prenom}</td>
            <td>${getContructor.Email}</td>
            <td>${getContructor.Telephone}</td>
            <td>${getContructor.Adresse}</td>
            <td>${getContructor.Numero_du_Permis}</td>
            <td>${getContructor.Nombre_de_Point}</td>
          </tr>

          `)
    }
});
};
});