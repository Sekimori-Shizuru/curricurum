package interfaces;

public class Nanaumi implements OrderFromMotoki, OrderFromShihanndai {

	
	private String name;
	private String date;
	
	public Nanaumi(String n, String yyyyMM) {
		name = n;
		date = yyyyMM;
	}
	
	private void submitOrder(final int shortFlg) {
		String nameAnd = name + "、";
		
		if (shortFlg == 0) {
			System.out.println(nameAnd + date + "の勤務表出しました");
		} else if(shortFlg == 1) {
			System.out.println(nameAnd + date + "の交通費も出しました");
		} else {
			System.out.println(nameAnd + "本当はまだ何も出してません");
		}
	
	}
	
	public void doNothing() {
		submitOrder(-1);
	}
	
	@Override
	public void daseyaKinmuhyo() {
		// TODO 自動生成されたメソッド・スタブ
		submitOrder(0);
	}

	@Override
	public void daseyaKotsuhi() {
		// TODO 自動生成されたメソッド・スタブ
		submitOrder(1);
	}

	@Override
	public String doCreateJavaCurriculum() {
		// TODO 自動生成されたメソッド・スタブ
		return "Javaカリキュラム完成しました！";
	}

	
}
