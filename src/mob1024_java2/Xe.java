package mob1024_java2;

public class Xe {
	private String hangXe;
	private int namSanXuat;
	
	public Xe() {
	}
	public Xe(String hangXe, int namsanxuat) {
		this.hangXe = hangXe;
		this.namSanXuat = namsanxuat;
	}
	public String gethangXe() {
		return this.hangXe;
	}
	
	public void sethangXe(String hangXe) {
		this.hangXe = hangXe;
	}
	
	public int getnamSanXuat() {
		return this.namSanXuat;
	}
	
	public void setnamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}
	
	public void xuat() {
		System.out.println("Hang xe: "+ this.hangXe+"\n Nam san xuat: "+this.namSanXuat);
	}
}
