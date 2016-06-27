package register.info;

import com.sun.rowset.*;

public class showPage {
	CachedRowSetImpl rowSet=null;
	int pageSize=10;
	int pageAllCount=0;
	int showPageNum=1;
	StringBuffer presentPageResult;
	public void setRowSet(CachedRowSetImpl rowSet){
		this.rowSet=rowSet;
	}
	public void setPageSize(int pageSize){
		this.pageSize=pageSize;
	}
	public void setPageAllCount(int pageAllCount){
		this.pageAllCount=pageAllCount;
	}
	public void setShowPageNum(int showPageNum){
		this.showPageNum=showPageNum;
	}
	public void setPresentPageResult(StringBuffer presentPageResult){
		this.presentPageResult=presentPageResult;
	}
	public CachedRowSetImpl getRowSet(){
		return this.rowSet;
	}
	public int getPageSize(){
		return this.pageSize;
	}
	public int getPageAllCount(){
		return this.pageAllCount;
	}
	public int getShowPageNum(){
		return this.showPageNum;
	}
	public StringBuffer getPresentPageResult(){
		return this.presentPageResult;
	}
}
