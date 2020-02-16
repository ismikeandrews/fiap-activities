var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/somar/:numero1/:numero2', function(req, res, next) {
  
  //req - request (Obtem dados)
  //res - response (Devolve dados)

  //captar var do tipo params (paramentros de url)

  let num1 = Number(req.params.numero1)
  let num2 = Number(req.params.numero2)

  var total = num1 + num2

  //captart var do tipo query (Ex: ?numero)
  res.status(200).json({
    "total": total,
    "mensagem": `A soma é igual a ${total}`
  })
  // res.render('index', { total: total });

});

router.get('/dividir/:numero1/:numero2', function(req, res, next) {
  
  //req - request (Obtem dados)
  //res - response (Devolve dados)

  //captar var do tipo params (paramentros de url)

  let num1 = Number(req.params.numero1)
  let num2 = Number(req.params.numero2)

  var total = num1 / num2

  //captart var do tipo query (Ex: ?numero)
  res.status(200).json({
    "total": total,
    "mensagem": `A soma é igual a ${total}`
  })
  // res.render('index', { total: total });

});

router.get('/multiplicar/:numero1/:numero2', function(req, res, next) {
  
  //req - request (Obtem dados)
  //res - response (Devolve dados)

  //captar var do tipo params (paramentros de url)

  let num1 = Number(req.params.numero1)
  let num2 = Number(req.params.numero2)

  var total = num1 * num2

  //captart var do tipo query (Ex: ?numero)
  res.status(200).json({
    "total": total,
    "mensagem": `A soma é igual a ${total}`
  })
  // res.render('index', { total: total });

});

router.get('/sub/:numero1/:numero2', function(req, res, next) {
  
  //req - request (Obtem dados)
  //res - response (Devolve dados)

  //captar var do tipo params (paramentros de url)

  let num1 = Number(req.params.numero1)
  let num2 = Number(req.params.numero2)

  var total = num1 - num2

  //captart var do tipo query (Ex: ?numero)
  res.status(200).json({
    "total": total,
    "mensagem": `A soma é igual a ${total}`
  })
  // res.render('index', { total: total });

});


module.exports = router;
