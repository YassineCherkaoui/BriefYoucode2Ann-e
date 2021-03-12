$(document).ready(function () {
    $("#loginForm").submit(function (e) {
        e.preventDefault();
        if ($("#userEmail").val() != '' && $("#userPassword").val() != '') {
            if ($("#userEmail").val() == 'test' && $("#userPassword").val() == 'test') {
                window.location.href = 'index.html';
            } else {
                alert('invalid username password');
                location.reload()
            }
        } else {
            alert('username or password cann\'t be blank');
            location.reload()
        }
    });
});