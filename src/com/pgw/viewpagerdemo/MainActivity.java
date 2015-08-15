package com.pgw.viewpagerdemo;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.view.View;

public class MainActivity extends Activity {
	private ViewPager mPager;
	private PagerTabStrip mTitile;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
//		1.��ʼ��ViewPager
		mPager=(ViewPager) findViewById(R.id.viewPager);
//		2.��ʼ��ViewPager�е�����ҳ��
		List<View> viewList=getData();
//		��ʼ��PagerTabStrip
		mTitile=(PagerTabStrip)findViewById(R.id.tab);
//		���ñ���ɫ
		mTitile.setBackgroundColor(Color.GRAY);
//		����������ɫ
		mTitile.setTextColor(Color.RED);
//		�����Ƿ�����»���
		mTitile.setDrawFullUnderline(false);
//		����ָʾ����ɫ
		mTitile.setTabIndicatorColor(0xff999999);
		
//		3.��ʼ��title����
		List<String> tatileData=getTatileData();
//		4.����ViewPager������
		MyPagerAdapter adapter=new MyPagerAdapter(viewList,tatileData);
//		5.��ViewPager����������
		mPager.setAdapter(adapter);
		
		
	}
	/**
	 * ��ȡ���еı���
	 * @return
	 */
	private List<String> getTatileData() {
		List<String> list=new ArrayList<String>();
		list.add("��һҳ");
		list.add("�ڶ�ҳ");
		list.add("����ҳ");
		list.add("����ҳ");
		
		return list;
	}
	/**
	 * ��ȡ���е�����ҳ
	 * @return
	 */
	private List<View> getData() {
		List<View>list=new ArrayList<View>();
//		�������е�View����
		View view1=View.inflate(this, R.layout.view1, null);
		View view2=View.inflate(this, R.layout.view2, null);
		View view3=View.inflate(this, R.layout.view3, null);
		View view4=View.inflate(this, R.layout.view4, null);
		
//		�����е�����ҳView��ӵ�������
		list.add(view1);
		list.add(view2);
		list.add(view3);
		list.add(view4);
		return list;
	}


}
