//__________________CALL MODEL____________________
const Conducteur = require('../Models/Conducteur.Models');

//Call Packages JSON Web Token & BCRYPT
const jwt = require('jsonwebtoken');
//A library to help you hash passwords.
const bcrypt = require('bcrypt');
// _____________PACKAGES NODEMAILER___________
const nodemailer = require("nodemailer");

const jwt_decode = require('jwt-decode');
//-------------------------Ajouter Conducteur-----------------------------

exports.ConducteurAdd = async(req, res) => {

      const conducteur = new Conducteur({
        Matricule: req.body.Matricule,
        Nom: req.body.Nom,
        phone: req.body.phone,
        Prenom: req.body.Prenom,
        Email: req.body.Email,
        Telephone: req.body.Telephone,
        Adresse : req.body.Adresse,
        Numero_du_Permis : req.body.Numero_du_Permis,
        Nombre_de_Point : req.body.Nombre_de_Point,
        validation : false,
        role : 'Conducteur',
      });
      //Save
      conducteur.save()
      .then(() => res.json("conducteur added successfully"))
      .catch((err) => res.status(400).json("Error :" + err));

    
      const token = jwt.sign({Login: req.body.Login, Email : req.body.Email}, 'tokenkey');

      const transport = nodemailer.createTransport({
        service: "gmail",
            auth: {
                user: 'cyassin95@gmail.com',//email
                pass: 'Sanasaida123'//password
            }
        })
      
        await transport.sendMail({
            from: 'Cyassin95@gmail.com',
            to: req.body.Email,
            subject: "Email verification",
            html: `
            <h2>Please click on below link to activate your account</h2>
            <p>http://localhost:8081/validateAccount/${token}</p>
        `
        })
    };
  
 
    //------------------------Client authentication---------------------
exports.conducteurActivated =  async(req, res) => {
  const token = req.params.token;

  jwt.verify(token, 'tokenkey');

  let decoded = await jwt_decode(token);
  let Login = decoded.Login;

   await Conducteur.findOneAndUpdate({ Login: Login },{validation : true});

   res.json({
           message : "Your Account validate please login again"
   });
  // res.send('')
}


    //______________________get all conducteur_____________________ 
    exports.getConducteur = (req, res) => {
      Conducteur.find()
        .then(ConducteurInfos => {
          res.status(200).json(ConducteurInfos);
        }).catch(error => {
          console.log(error);
          res.status(500).json({
            message: "Error!",
            error: error
          });
        });
    };

    
// ______________________get conductor info by Matricule__________________
exports.getconductorBymatricule = (req, res) => {
  Conducteur.find({
    Matricule: req.params.Matricule
    })
    .then(Conducteur => {
      res.send(Conducteur);
    }).catch(err => {
      res.status(500).send({
        message: err.message || "Some error occurred while retrieving question."
      });
    });
};