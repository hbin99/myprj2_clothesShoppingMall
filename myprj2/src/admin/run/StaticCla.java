package admin.run;

import admin.view.MainView;

public class StaticCla {

	public static MainView mv;
	public static String id;
	public static String ip;
	public static final String FILE_PATH = "C:/dev/workspace/myprj2/src/admin/img";

	public StaticCla(MainView mv, String id, String ip) {
		this.mv = mv;
		this.id = id;
		this.ip = ip;
	}

}
