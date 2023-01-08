
function isValidUsername (str) {
  return ['admin', 'editor'].indexOf(str.trim()) >= 0;
}

function isExternal (path) {
  return /^(https?:|mailto:|tel:)/.test(path);
}

function checkAmount (rule, value, callback){
  if (value == "") {
    callback(new Error("Please enter the amount."))
  } else {
    callback()
  }
}

function checkFood (rule, value, callback){
  if (value == "") {
    callback(new Error("Please enter the name of the food."))
  } else {
    callback()
  }
}

function checkSub (rule, value, callback){
  if (value == "") {
    callback(new Error("Please select the sub-category."))
  } else {
    callback()
  }
}

function checkCat (rule, value, callback){
  if (value == "") {
    callback(new Error("Please select the category."))
  } else {
    callback()
  }
}