package KelompokEdit;

import java.util.Random;
import java.util.Scanner;

public class Kelompok {
	
	int RandNama(int data){
		Random random = new Random();
		int kelompok = random.nextInt(data);
		return kelompok;
	}
	
	int cek(int k, int Name, int i, String[] Nama, String[] Done, int data){
		for(k=0; k<data;k++){
			if(Nama[Name]==Done[k]){
				return 1;
			}
		}
		return 2;
	}
	
	public static void main(String[] args) {
		int k=0	,i = 0, j=0, l=0,m=1;
		Scanner in = new Scanner(System.in);
		System.out.println("**Aplikasi Pengacakan Kelompok**\n");
		System.out.print("Masukkan Banyak Data : ");
		int data = in.nextInt();
		System.out.print("1 kelompok terdiri dari berapa orang? ");
		int anggota = in.nextInt();
		String[] Done = new String[data];
		String[] Nama = new String[data];
		System.out.println("Masukkan Nama/data (pisah dengan enter): ");
		in.nextLine();
		for(int z=0; z<data;z++){
			Nama[z] = in.nextLine();
		}
		
		Kelompok kel = new Kelompok();
		int Name = kel.RandNama(data);
		String Jeneng = Nama[Name];
		Done[i] = Jeneng;
		System.out.println("Kelompok = "+m);
		for(int o=0;o<data;o++){
			if(l!=data){
				if(kel.cek(k, Name, i, Nama, Done, data)==1){
					o--;
					Name = kel.RandNama(data);
				}
				if(kel.cek(k, Name, i, Nama, Done, data)==2){
					if((j+1)==anggota+1){
						m++;
						System.out.println("\n"+"Kelompok = "+m);
						j=0;
					}
					System.out.println((j+1)+". "+Nama[Name]);
					Done[i++] = Nama[Name];
					j++;
					l++;
				}
			}
		}
		in.close();
	}
}
