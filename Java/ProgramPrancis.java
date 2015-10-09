import java.util.Scanner;

public class ProgramPrancis{
		
		String nama, jenis, ket, p;
		int umur;
			
		void masukan(){
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Masukan nama anda: ");
			nama = input.nextLine();
			
			System.out.print("Masukan umur anda: ");
			umur = input.nextInt();
			
			System.out.print("Jenis kelamin P atau L: ");
			jenis = input.nextLine();
			
			
			if (umur > 17) {
				if (jenis == "p"){
					ket = "Selamat anda lulus!";
				}else{
					ket = "Maaf anda bukan perempuan.";
				}
			}else{
				ket = "Maaf anda terlalu muda.";
			}
			System.out.println("");
			System.out.println("Nama anda " + nama + ". " + ket);
			System.out.println("");
				pilihan();
			
			}
			
		
		void pilihan(){
			Scanner input = new Scanner(System.in);
			System.out.println("=========================");
			System.out.println("1.Input Lagi\n2.Keluar");
			System.out.print("Pilihan anda: ");
			int plh = input.nextInt();
			System.out.println("");
			System.out.println("");
			
			ProgramPrancis ulang = new ProgramPrancis();
			switch(plh){
				case 1:
					masukan();
				case 2:
					System.exit(1);
				default:
					System.out.println("invalid");
					ulang.pilihan();
				}
			}
		public static void main(String[]args){
			System.out.println("");
			System.out.println("PROGRAM PRANCIS");
			System.out.println("-------------------------");
			System.out.println("");
			ProgramPrancis ulang = new ProgramPrancis();
			ulang.masukan();
			ulang.pilihan();
		
	}
}