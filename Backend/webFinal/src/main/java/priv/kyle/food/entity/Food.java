package priv.kyle.food.entity;

public class Food {
	private Integer fid;
	private Integer tid;
	private String fname;
	private String fpic;
	private Double fprice;
	private String fdesc;
	private String fregtime;
	private Ftype ftype;
	public Integer getFid() {
		return fid;
	}
	public void setFid(Integer fid) {
		this.fid = fid;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getFpic() {
		return fpic;
	}
	public void setFpic(String fpic) {
		this.fpic = fpic;
	}
	public Double getFprice() {
		return fprice;
	}
	public void setFprice(Double fprice) {
		this.fprice = fprice;
	}
	public String getFdesc() {
		return fdesc;
	}
	public void setFdesc(String fdesc) {
		this.fdesc = fdesc;
	}
	public String getFregtime() {
		return fregtime;
	}
	public void setFregtime(String fregtime) {
		this.fregtime = fregtime;
	}
	public Ftype getFtype() {
		return ftype;
	}
	public void setFtype(Ftype ftype) {
		this.ftype = ftype;
	}
	public Food() {
		super();
	}
	@Override
	public String toString() {
		return "Food [fid=" + fid + ", tid=" + tid + ", fname=" + fname + ", fpic=" + fpic + ", fprice=" + fprice
				 + ", fdesc=" + fdesc + ", fregtime=" + fregtime + ", ftype=" + ftype + "]";
	}
	public Food(Integer fid, Integer tid, String fname, String fpic, Double fprice, String fdesc,
			String fregtime) {
		super();
		this.fid = fid;
		this.tid = tid;
		this.fname = fname;
		this.fpic = fpic;
		this.fprice = fprice;
		this.fdesc = fdesc;
		this.fregtime = fregtime;
	}
	
}
