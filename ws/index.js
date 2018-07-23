var express = require('express');
var app = express();

//static
app.use('/static', express.static('public'))

//parse
//const bodyParser = require('body-parser');
//app.use(bodyParser.urlencoded({ extended: false }));
//app.use(bodyParser.json());


//get
app.get('/greeting', function (req, res) {
    
    var name = req.query.name;
    res.send(name + ' from server');
 });


 //post
 app.post("/greetingPost",function(req,res){
    var body = '';
    req.on('data', function (data) {
        body += data;
    });
    req.on('end', function () {
        res.end(body);   
    });
});


 var server = app.listen(8080, function () {

    var host = server.address().address
    var port = server.address().port
  
    console.log("Example app listening at http://%s:%s", host, port)
  
  })