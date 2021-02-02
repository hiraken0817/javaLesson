package local.hal.sa31.androidjava.lesson1.asgmt;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class BirthdayReminder {
	public static void main(String[] args) {
		GirlFriend[] gFriend = new GirlFriend[6];
		gFriend[0] = new GirlFriend("まゆみ", 1998, 1, 5);
		gFriend[1] = new GirlFriend("さちこ", 2003, 5, 15);
		gFriend[2] = new GirlFriend("まい", 1996, 5, 25);
		gFriend[3] = new GirlFriend("なみ", 1999, 8, 3);
		gFriend[4] = new GirlFriend("えり", 2001, 11, 19);
		gFriend[5] = new GirlFriend("りえ", 1997, 12, 23);

		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        String str = sdf.format(timestamp);
        int year = Integer.parseInt(str);

		for (int i = 1; i <= 12; i++) {
			System.out.println("■ ■ ■ ■ " + i + "月です。");
			for (int j = 0; j < gFriend.length; j++) {
				if (gFriend[j].isBirthMonth(i)) {
					System.out.println(gFriend[j].getName() + "ちゃんが" + gFriend[j].getBirthDay() + "日に誕生日です" + gFriend[j].getAge(year) + "歳になります。メッセージを送りましょう!");
				}
			}
		}
	}

}
