package com.nchu.test01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws IOException {
    	File file = new File("src/password.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuffer bf = new StringBuffer();
        Scanner s = new Scanner(System.in);
        String m_Username = "";
        String m_Password = "";
        String username = "";
        String password = "";
        boolean flag=false;
        m_Username = br.readLine();
        m_Password = br.readLine();
        System.out.println("请输入账号和密码：");
        username = s.nextLine();
        password = s.nextLine();
//        String str = "";
//        int i = 0;
        if(m_Username.equals(username) && m_Password.equals(password)) {
        	flag = true;
        }
//        while ((str = br.readLine()) != null) {
//            if (!sha256hex(str).equals(sha256hex(strs[i++]))) {
//				flag=false;
//             	break;
//            }
//	    }
		if(flag){
			System.out.println("恭喜你,登录成功!");	
		} else {
			System.out.println("账号或密码错误!");
		}
        br.close();
	}
    public static String sha256hex(String input) {
    	
        return DigestUtils.sha256Hex(input);
    }
}

