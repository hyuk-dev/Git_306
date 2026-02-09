package kosta.service;

public class GoodsService {

	public void insert() {
		System.out.println("insert call...");
	}
	
	public void select() {
		System.out.println("select 추가...");
		System.out.println("select 정상 작동");
		System.out.println("원격에서 수정 conflict");
	}

	public void delete() {
		System.out.println("remote에서 delete 수정");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
