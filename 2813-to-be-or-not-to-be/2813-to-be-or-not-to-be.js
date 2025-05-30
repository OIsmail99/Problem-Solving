/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
  let object = {
    toBe: function(val2){
        if(val === val2) return true;
        throw ("Not Equal");
    },
    notToBe: function(val2){
        if(val !== val2)return true;
        throw ("Equal");
    }
  }  
    return object;
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */