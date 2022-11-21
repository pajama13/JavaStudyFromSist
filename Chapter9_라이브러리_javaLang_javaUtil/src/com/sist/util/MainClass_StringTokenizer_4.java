/*

"https://mp-seoul-image-production-s3.mangoplate.com/479607/1440124_1668819776229_1000001557?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^"
+"https://mp-seoul-image-production-s3.mangoplate.com/479607/1440124_1668819776229_1000001556?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^"
+"https://mp-seoul-image-production-s3.mangoplate.com/479607/1440124_1668819776229_1000001558?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^"
+"https://mp-seoul-image-production-s3.mangoplate.com/479607/1440124_1668819776229_1000001555?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^"
+"https://mp-seoul-image-production-s3.mangoplate.com/479607/1013171_1667742567362_1000001468?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^";

 */
package com.sist.util;

public class MainClass_StringTokenizer_4 {

	public static void main(String[] args) {
		//5개 이미지 주소 복붙
		String image="https://mp-seoul-image-production-s3.mangoplate.com/479607/1440124_1668819776229_1000001557?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^"
				+"https://mp-seoul-image-production-s3.mangoplate.com/479607/1440124_1668819776229_1000001556?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^"
				+"https://mp-seoul-image-production-s3.mangoplate.com/479607/1440124_1668819776229_1000001558?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^"
				+"https://mp-seoul-image-production-s3.mangoplate.com/479607/1440124_1668819776229_1000001555?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^"
				+"https://mp-seoul-image-production-s3.mangoplate.com/479607/1013171_1667742567362_1000001468?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80^";
		//맨앞 이미지 1개 잘라오기
		//1개만 자를 땐 substring 여러 개 구분 지을 땐 token
		String fImage=image.substring(0,image.indexOf("^"));
		System.out.println(fImage);
		
		String lImage=image.substring(0,image.lastIndexOf("^"));
		System.out.println(lImage);
		
	}

}
