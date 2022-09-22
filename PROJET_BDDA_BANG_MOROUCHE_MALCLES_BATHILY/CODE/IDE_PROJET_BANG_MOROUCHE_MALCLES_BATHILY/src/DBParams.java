
public class DBParams {
	public static String dbPath;
	public static int pageSize;
	public static int maxPagesPerFile;
	
	public DBParams(String path, int size, int maxPagesPerFile) {
		this.dbPath = path;
		this.pageSize = size;
		this.maxPagesPerFile = maxPagesPerFile;
	}
}
