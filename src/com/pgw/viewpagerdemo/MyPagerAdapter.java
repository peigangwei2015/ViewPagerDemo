package com.pgw.viewpagerdemo;

import java.util.List;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

public class MyPagerAdapter extends PagerAdapter {
	private List<View> viewList;
	private List<String> titleData;

	public MyPagerAdapter(List<View> viewList, List<String> tatileData) {
		this.viewList = viewList;
		this.titleData=tatileData;
	}

	// ��ȡҳ��ĸ���
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return viewList.size();
	}

	// view�Ͷ����Ƿ����
	@Override
	public boolean isViewFromObject(View arg0, Object arg1) {
		return arg0 == arg1;
	}

	// ʵ����ҳ��ʱ����
	@Override
	public Object instantiateItem(ViewGroup container, int position) {
		container.addView(viewList.get(position));
		return viewList.get(position);
	}

	// ����ҳ��ʱ����
	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		container.removeView(viewList.get(position));
	}
	
//	���ñ���
	@Override
	public CharSequence getPageTitle(int position) {
		return titleData.get(position);
	}
	

}
