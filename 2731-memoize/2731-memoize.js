/**
 * @param {Function} fn
 * @return {Function}
 */
function memoize(fn) {
    //cache could be an object or a map
    let cache = {}; //key is the args, value is the return of the function.
    return function(...args) { //rest
        let key = JSON.stringify(args);
        if(cache.hasOwnProperty(key)){ //if it exists
        //it cannot be if(cache[key]) because if it returns 0 then it will evaluate to false, even tho the key exists
        //so use hasOwnProperty instead to make sure the key definitely exists.
            return cache[key];
        }
        
        else{
            //call the function and save the result in the cache for later use.
            let result = fn(...args);
            cache[key] = result;
            return result;
        }
    }
}


/** 
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1 
 */