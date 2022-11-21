/*
https://www.google.com/search?q=%EC%9E%90%EB%B0%94&hl=ko&source=hp&ei=wMZ6Y6qeMOji2roPlrSW4As&iflsig=AJiK0e8AAAAAY3rU0PnQkGqpJJY03NNgLwV_zS9yUV-4&ved=0ahUKEwiq_uzZgr77AhVosVYBHRaaBbwQ4dUDCAo&uact=5&oq=%EC%9E%90%EB%B0%94&gs_lcp=Cgdnd3Mtd2l6EAMyCwgAEIAEELEDEIMBMggIABCABBCxAzIICAAQgAQQsQMyCAgAEIAEELEDMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEOhEILhCABBCxAxCDARDHARDRAzoOCC4QgAQQsQMQxwEQ0QM6CwguEIAEELEDEIMBOgsILhCABBCxAxDUAjoECC4QAzoICC4QgAQQ1AJQAFj5AWDPBGgBcAB4AYABhAGIAf8DkgEDMC40mAEAoAEB&sclient=gws-wiz
 */
package com.sist.string;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class MainClass_String_2 {

	public static void main(String[] args) {
		try {
			//인코딩 : 바이트로 변환
			System.out.println("--- 인코딩 ---");
			String name="다코야끼";
			byte[] b=name.getBytes("UTF-8");
			//System.out.println(Arrays.toString(b));
			for(byte bb:b)
			{
				System.out.print(String.format("%02x", bb)); //16진법 출력
			}
			System.out.println();
			System.out.println("--- 디코딩 ---");
			byte[] b2=name.getBytes("CP949"); //윈도우에서 인식하는 한글
			for(byte bb:b2)
			{
				System.out.print(String.format("%02x", bb)); //16진법 출력
			}
		} catch (Exception e) {

		}
	}

}
