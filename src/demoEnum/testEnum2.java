package demoEnum;

public enum testEnum2 {
	
	
	Monday("星期一"),Tuesday("星期二"),Wednesday("星期三"),
	Thursday("星期四"),Friday("星期五"), Saturday("星期六"),
	Sunday("星期天");
	private String week;

	public String getWeek() {
		return week;
	}

	testEnum2(String week) {
		this.week = week;
	}

}
