// { autofold
package com.yourself;

import java.util.Arrays;

public class Sum {
// }

public int sum(int... ns) {
//	int result = 0;
//	for(int i : ns){ 
//		result += i; // fix me!
//	} 
//	return result;
	return Arrays.stream(ns).sum();
}

//{ autofold
}
//}