package com.sist.dao;
import java.util.*;
public class EmpVO {
   private int empno;
   private String ename;
   public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
private String job;
   private  int mgr,sal,comm,deptno;
   private Date hiredate;
   // 조인 => VO는 테이블당 한개씩 만든다 => 조인,독립적 사용이 가능
   // 조인 => 포함 클래스
   private DeptVO dvo=new DeptVO();
   private SalGradeVO svo=new SalGradeVO();
   
public DeptVO getDvo() {
	return dvo;
}
public void setDvo(DeptVO dvo) {
	this.dvo = dvo;
}
public SalGradeVO getSvo() {
	return svo;
}
public void setSvo(SalGradeVO svo) {
	this.svo = svo;
}
public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
public String getName() {
	return ename;
}
public void setName(String name) {
	this.ename = name;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}
public int getMgr() {
	return mgr;
}
public void setMgr(int mgr) {
	this.mgr = mgr;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
public int getComm() {
	return comm;
}
public void setComm(int comm) {
	this.comm = comm;
}
public int getDeptno() {
	return deptno;
}
public void setDeptno(int deptno) {
	this.deptno = deptno;
}
public Date getHiredate() {
	return hiredate;
}
public void setHiredate(Date hiredate) {
	this.hiredate = hiredate;
}
   
}
