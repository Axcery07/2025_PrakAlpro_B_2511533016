package pekan2;

public class DeklarasiVariabel {
	/* program java
	 * latihan
	 * tentang pendeklarasian variabel
	 */
    static int umur=25; /* Variabel dapat langsung diinisiasi */
	public static void main(String[] args) {
		int kode;
		boolean isDibawahumur; /* perhatikan penulisan nama variasi */
		kode = 1234; /* pengisian variabel (assigment) */
		double gaji; /* deklarasi  variabel dapat dimana saja */
		gaji = 5500000.23;
		isDibawahumur = true;
		System.out.println("Status; "+isDibawahumur);
		System.out.println("kode:"+kode);
		System.out.println("Umur:"+umur);
		System.out.println("gaji:"+gaji);
	}

}
