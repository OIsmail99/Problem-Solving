/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {
    let chunked = [];
    if(arr.length === 0) return chunked;
    if(size > arr.length){
        chunked.push(arr);
        return chunked;
    }
    
    
    //
    let i = 0;
    while(i < arr.length){
        let newArr = [];  
        for(let j = 0; j < size && i < arr.length; j++){
            // if(i === arr.length) return chunked;
            newArr.push(arr[i])
            i++;
        }
        chunked.push(newArr);   
    }
    return chunked;

};
