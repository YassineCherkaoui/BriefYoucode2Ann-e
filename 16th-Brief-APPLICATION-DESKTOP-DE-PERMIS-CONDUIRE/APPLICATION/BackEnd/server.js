const express = require('express');

const app = express();

const mongoose = require('mongoose');

var bodyPrser = require('body-parser');

const cors = require("cors");

app.use(express.json());
app.use(cors());

app.use(bodyPrser.urlencoded({extended:true}))

app.use(bodyPrser.json())

const logWinston = require('./log/log');

require('dotenv').config()





//Mongoose
mongoose.connect('mongodb://localhost:27017/Permis',{
    useNewUrlParser : true
}).then(()=>{
    logWinston.info('Successfully Connected to the Database');
}).catch(err =>{
    logWinston.error('could not connect to the database . Exiting now..',
    process.exit());
});




app.get('/', (req,res)=>{
    res.send('Welcome to Permis de conduit')
})
//_______________Import______________
require('./Router/Conducteur.router')(app);
require('./Router/Admins.router')(app);

app.listen(process.env.PORT, () => {
    console.log("connected to server " + process.env.PORT);
  });






