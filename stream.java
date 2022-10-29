//202143501105_Bagas Prastomo_R3L_Pertemuan 7(Stream)

import java.io.*;
import java.text.DecimalFormat; //Needed to use DecimalFormat

public class stream {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		//Variable
		String x;
		int nomor=0,tugas,uts,uas;
		double nilaiakhir = 0,d = 0,mean = 0,a,b,c;
		
		//Input, output, write
		try {
            FileOutputStream output = new FileOutputStream("tugasp3.txt");
            PrintStream write = new PrintStream(output);
            
			write.println("9981117806701");
			write.println("0832348108521");
			write.println("1560016594591");
			write.println("3452416706704");
			write.print  ("5560247018199");
			write.close();
		}
		catch (Exception e) {System.out.println("Kesalahan : "+e.getMessage());}
		
		//Read, print, calculate
		try {
		FileInputStream input = new FileInputStream("tugasp3.txt");
		DataInputStream data = new DataInputStream(input);
		
		System.out.println("No\tTugas\t\tUTS\t\tUAS\t\tNilai Akhir");
		System.out.println("-------------------------------------------------------------------------");
		while (data.available() !=0) {
			x=data.readLine();
			nomor=nomor+1;
			tugas=Integer.parseInt(x.substring(1,3));
			uts=Integer.parseInt(x.substring(6,8));
			uas=Integer.parseInt(x.substring(9,11));
			a=(tugas*0.2);
			b=(uts*0.3);
			c=(uas*0.5);
			nilaiakhir=(a+b+c);
			d=d+nilaiakhir;
			
			DecimalFormat z = new DecimalFormat("0.00");
			
			System.out.println(nomor+"\t"+tugas+"\t\t"+uts+"\t\t"+uas+"\t\t"+z.format(nilaiakhir));
		}
		data.close();
		}
		catch (Exception e) {System.out.println("Kesalahan : "+e.getMessage());}
		
		System.out.println("-------------------------------------------------------------------------");
		mean=d/nomor;
		System.out.println("Rata-rata : "+Math.floor(mean)+"0");
	}
}
