package cn.spiderpig.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestIO {

	public static List<File> list = new ArrayList<File>();

	public static int a = 0;

	public void search() throws IOException {

		File file = null;

		if (TestIO.list.size() > 0) {
			file = TestIO.list.get(0);
			TestIO.list.remove(0);
		} else if (TestIO.list.size() == 0 && TestIO.a == 0) {
			file = new File("G:\\");
			TestIO.a = 1;
		}

		if (file != null) {
			File[] fileArr = file.listFiles();

			if (fileArr != null) {
				for (File f : fileArr) {
					if (f.isDirectory() && f.getName().equals("a")) {
						System.out.println(f.getAbsolutePath());
					} else {
						File a = new File("F:\\a");
						a.mkdir();
						File aa = new File("F:\\a\\a.txt");
						aa.createNewFile();
					}

				}
			}

			this.search();
		}

	}

	public static void main(String[] args) throws IOException {

		// 1、寻找与创建a\a.txt
		// TestIO testIO = new TestIO();
		// testIO.search();

		// 2、用字节流的方式往该txt中写入3行文字（中英文组合）
		// String str_1 = "a1111111111111";
		// String str_2 = "b2222222222222";
		// String str_3 = "c3333333333333";
		// str_1 += "\r\n";
		// str_2 += "\r\n";
		//
		// FileOutputStream output = new FileOutputStream("F:\\a\\a.txt");
		//
		// byte[] a = str_1.getBytes();
		// byte[] b = str_2.getBytes();
		// byte[] c = str_3.getBytes();
		// output.write(a);
		// output.write(b);
		// output.write(c);

		// 3、用字节流的方式从该txt将所有文字读出，打印
		// FileInputStream input = new FileInputStream("F:\\a\\a.txt");
		// byte[] d = new byte[1024];
		// int len = 0;
		// while ((len = input.read(d)) != -1) {
		//
		// System.out.println(new String(d, 0, len));
		//
		// }

//		 4、用字符流的方式往该txt中写入3行文字（中英文组合）
//		 FileWriter fw = new FileWriter("F:\\a\\a.txt");
//		
//		 BufferedWriter bw = new BufferedWriter(fw);
//		
//		 bw.write("d4444444444444");
//		
//		 bw.newLine();
//		
//		 bw.write("e5555555555555");
//		
//		 bw.newLine();
//		
//		 bw.write("f6666666666666");
//		 bw.flush();

		// 5、用字符流的方式从该txt将所有文字读出，打印
		FileReader fr = new FileReader("F:\\a\\a.txt");

		char[] ch = new char[1024];
		int len = 0;
		while ((len = fr.read(ch)) != -1) {

			System.out.println(new String(ch, 0, len));

		}

	}

}
