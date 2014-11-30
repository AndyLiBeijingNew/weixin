package net.cgt.weixin.fragment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.cgt.weixin.GlobalParams;
import net.cgt.weixin.R;
import net.cgt.weixin.domain.User;
import net.cgt.weixin.utils.DensityUtil;
import net.cgt.weixin.utils.LogUtil;
import net.cgt.weixin.view.adapter.PinyinAdapter;
import net.cgt.weixin.view.pinyin.AssortView;
import net.cgt.weixin.view.pinyin.AssortView.OnTouchAssortListener;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

/**
 * 通讯录
 * 
 * @author lijian-pc
 * @date 2014-11-27
 */
public class AddressBookFragment extends BaseFragment /*implements OnClickListener */{

	private static final String LOGTAG = LogUtil.makeLogTag(AddressBookFragment.class);

//	private LinearLayout mLl_addressbook_top;
	private ExpandableListView mElv_addressbook;
//	private LinearLayout mLl_addressbook_newFriend;
//	private LinearLayout mLl_addressbook_groupChat;
//	private LinearLayout mLl_addressbook_mark;
//	private LinearLayout mLl_addressbook_publicNumber;

	private AssortView mAv_addressbook_right;
	private PinyinAdapter adapter;
	private PopupWindow popupWindow;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.cgt_fragment_addressbook, null);
		init(v);
		return v;
	}

	private void init(View v) {
		initView(v);
		initData();
	}

	private void initView(View v) {
//		mLl_addressbook_top = (LinearLayout) v.findViewById(R.id.cgt_ll_addressbook_top);
		mElv_addressbook = (ExpandableListView) v.findViewById(R.id.cgt_elv_addressbook);
		mAv_addressbook_right = (AssortView) v.findViewById(R.id.cgt_av_addressbook_right);

//		mLl_addressbook_newFriend = (LinearLayout) v.findViewById(R.id.cgt_ll_addressbook_newFriend);
//		mLl_addressbook_groupChat = (LinearLayout) v.findViewById(R.id.cgt_ll_addressbook_groupChat);
//		mLl_addressbook_mark = (LinearLayout) v.findViewById(R.id.cgt_ll_addressbook_mark);
//		mLl_addressbook_publicNumber = (LinearLayout) v.findViewById(R.id.cgt_ll_addressbook_publicNumber);
//
//		mLl_addressbook_newFriend.setOnClickListener(this);
//		mLl_addressbook_groupChat.setOnClickListener(this);
//		mLl_addressbook_mark.setOnClickListener(this);
//		mLl_addressbook_publicNumber.setOnClickListener(this);
	}

	private void initData() {
		ArrayList<String> mItems = new ArrayList<String>();
		mItems.add("Diary of a Wimpy Kid 6: Cabin Fever");
		mItems.add("Steve Jobs");
		mItems.add("Inheritance (The Inheritance Cycle)");
		mItems.add("11/22/63: A Novel");
		mItems.add("张三");
		mItems.add("The Hunger Games");
		mItems.add("李四");
		mItems.add("王五");
		mItems.add("赵六");
		mItems.add("The LEGO Ideas Book");
		mItems.add("田七");
		mItems.add("Explosive Eighteen: A Stephanie Plum Novel");
		mItems.add("Catching Fire (The Second Book of the Hunger Games)");
		mItems.add("Elder Scrolls V: Skyrim: Prima Official Game Guide");
		mItems.add("Death Comes to Pemberley");
		mItems.add("Diary of a Wimpy Kid 6: Cabin Fever");
		mItems.add("Steve Jobs");
		mItems.add("Inheritance (The Inheritance Cycle)");
		mItems.add("11/22/63: A Novel");
		mItems.add("The Hunger Games");
		mItems.add("The LEGO Ideas Book");
		mItems.add("Explosive Eighteen: A Stephanie Plum Novel");
		mItems.add("Catching Fire (The Second Book of the Hunger Games)");
		mItems.add("Elder Scrolls V: Skyrim: Prima Official Game Guide");
		mItems.add("Death Comes to Pemberley");

		mItems.add("张三");
		mItems.add("李四");
		mItems.add("王五");
		mItems.add("赵六");
		mItems.add("田七");
		mItems.add("韩千叶");
		mItems.add("柳辰飞");
		mItems.add("夏舒征");
		mItems.add("慕容冲");
		mItems.add("萧合凰");
		mItems.add("阮停");
		mItems.add("西粼宿");
		mItems.add("孙祈钒");
		mItems.add("狄云");
		mItems.add("丁典");
		mItems.add("花错");
		mItems.add("顾西风");
		mItems.add("统月");
		mItems.add("苏普");
		mItems.add("江城子");
		mItems.add("柳长街");
		mItems.add("韦好客");
		mItems.add("袁冠南");
		mItems.add("燕七");
		mItems.add("金不换 ");

		mItems.add("장삼");
		mItems.add("영희");
		mItems.add("王五");
		mItems.add("赵六");
		mItems.add("삼칠초");
		mItems.add("韩千叶");
		mItems.add("柳辰飞");
		mItems.add("夏舒征");
		mItems.add("慕容冲");
		mItems.add("萧合凰");
		mItems.add("阮停");
		mItems.add("서 노인 맑고 깨끗하다");
		mItems.add("孙祈钒");
		mItems.add("성 구름");
		mItems.add("丁典");
		mItems.add("잘못 썼다");
		mItems.add("顾西风");
		mItems.add("전부 달");
		mItems.add("소 보편적");
		mItems.add("장청 아들");
		mItems.add("버드나무 장거리");
		mItems.add("위 손님 접대를 좋아한다");
		mItems.add("袁冠南");
		mItems.add("연 일곱");
		mItems.add("먹");
//		mItems.add(" 新的朋友");
//		mItems.add(" 群聊");
//		mItems.add(" 标签");
//		mItems.add(" 公众号");

		Collections.sort(mItems);

		List<User> mList = new ArrayList<User>();
		for (int i = 0; i < mItems.size(); i++) {
			User user = new User();
			user.setUserAccount(mItems.get(i));
			if (i % 5 == 0) {
				user.setUserPhote(String.valueOf(R.drawable.icon));
			} else {
				user.setUserPhote(String.valueOf(R.drawable.user_picture));
			}

			mList.add(user);
		}
		
//		List<User> mList_top = new ArrayList<User>();
		User user1 = new User();
		user1.setUserAccount("    新的朋友");
		user1.setUserPhote(String.valueOf(R.drawable.cgt_addressbook_newfriend));
		User user2 = new User();
		user2.setUserAccount("   群聊");
		user2.setUserPhote(String.valueOf(R.drawable.cgt_addressbook_groupchat));
		User user3 = new User();
		user3.setUserAccount("  标签");
		user3.setUserPhote(String.valueOf(R.drawable.cgt_addressbook_mark));
		User user4 = new User();
		user4.setUserAccount(" 公众号");
		user4.setUserPhote(String.valueOf(R.drawable.cgt_addressbook_publicnumber));
//		mList_top.add(user1);
//		mList_top.add(user2);
//		mList_top.add(user3);
//		mList_top.add(user4);
		mList.add(user1);
		mList.add(user2);
		mList.add(user3);
		mList.add(user4);

		if (adapter == null) {
			adapter = new PinyinAdapter(GlobalParams.activity, mList);
		} else {
			adapter.notifyDataSetChanged();
		}
		mElv_addressbook.setAdapter(adapter);

		// 展开所有
		for (int i = 0, length = adapter.getGroupCount(); i < length; i++) {
			mElv_addressbook.expandGroup(i);
		}

		// 字母按键回调
		mAv_addressbook_right.setOnTouchAssortListener(new OnTouchAssortListener() {

			View layoutView = LayoutInflater.from(getActivity()).inflate(R.layout.cgt_layout_addressbook_middle_alert_dialog, null);
			TextView text = (TextView) layoutView.findViewById(R.id.cgt_tv_addressbook_content);

			@Override
			public void onTouchAssortListener(String str) {
				//				if (str.equals("↑")) {
				//					mLl_addressbook_top.setVisibility(View.VISIBLE);
				//				} else {
				//					mLl_addressbook_top.setVisibility(View.GONE);
				//				}
				int index = adapter.getAssort().getHashList().indexOfKey(str);
				if (index != -1) {
					mElv_addressbook.setSelectedGroup(index);
				}
				if (popupWindow != null) {
					text.setText(str);
				} else {
					popupWindow = new PopupWindow(layoutView, DensityUtil.dip2px(getActivity(), 80), DensityUtil.dip2px(getActivity(), 80), false);
					// 显示在Activity的根视图中心
					popupWindow.showAtLocation(getActivity().getWindow().getDecorView(), Gravity.CENTER, 0, 0);
				}
				text.setText(str);
			}

			@Override
			public void onTouchAssortUP() {
				if (popupWindow != null) {
					popupWindow.dismiss();
					popupWindow = null;
				}
			}
		});
	}

	@Override
	public void onStop() {
		if (popupWindow != null) {
			popupWindow.dismiss();
			popupWindow = null;
		}
		super.onStop();
	}

	@Override
	public void onDestroy() {
		if (popupWindow != null) {
			popupWindow.dismiss();
			popupWindow = null;
		}
		super.onDestroy();
	}

//	@Override
//	public void onClick(View v) {
//		switch (v.getId()) {
//		case R.id.cgt_ll_addressbook_newFriend:
//			L.i(LOGTAG, "新的朋友");
//			AppToast.getToast().show(R.string.text_addressbook_newFriend);
//			break;
//		case R.id.cgt_ll_addressbook_groupChat:
//			L.i(LOGTAG, "群聊");
//			AppToast.getToast().show(R.string.text_addressbook_groupChat);
//			break;
//		case R.id.cgt_ll_addressbook_mark:
//			L.i(LOGTAG, "标签");
//			AppToast.getToast().show(R.string.text_addressbook_mark);
//			break;
//		case R.id.cgt_ll_addressbook_publicNumber:
//			L.i(LOGTAG, "公众号");
//			AppToast.getToast().show(R.string.text_addressbook_publicNumber);
//			break;
//
//		default:
//			break;
//		}
//	}
}
