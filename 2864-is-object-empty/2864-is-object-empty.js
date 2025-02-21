/**
 * @param {Object|Array} obj
 * @return {boolean}
 */
var isEmpty = function(obj) {
    console.log(Object.keys(obj)) //returns the keys of an object in an array
    //if obj is an array, it will return an array of indices of this array.
    if(Object.keys(obj).length === 0) return true;
    return false;
};