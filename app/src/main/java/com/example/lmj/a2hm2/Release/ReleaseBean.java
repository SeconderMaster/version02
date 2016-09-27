package com.example.lmj.a2hm2.Release;

import java.util.ArrayList;
import java.util.List;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.datatype.BmobFile;

/**
 * Created by wfh on 2016/9/26.
 */
public class ReleaseBean extends BmobObject {
    private String mGoodS_title;
    private String mGoods_des;
    private String mGoods_classify;
    private String mGoods_pri;
    private BmobFile pic1;
    private BmobFile pic2;
    private BmobFile pic3;
    private BmobFile pic4;
    private BmobFile pic5;
    private BmobFile pic6;
    private BmobFile pic7;
    private BmobFile pic8;
    private BmobFile pic9;
    private BmobFile pic610;

    public List<BmobFile> getSelect_pics() {
        return select_pics;
    }

    public void setSelect_pics(List<BmobFile> select_pics) {
        this.select_pics .addAll(select_pics);
    }

    private List<BmobFile> select_pics=new ArrayList<>();
    public BmobFile getPic2() {
        return pic2;
    }

    public void setPic2(BmobFile pic2) {
        this.pic2 = pic2;
    }

    public BmobFile getPic1() {
        return pic1;
    }

    public void setPic1(BmobFile pic1) {
        this.pic1 = pic1;
    }

    public BmobFile getPic3() {
        return pic3;
    }

    public void setPic3(BmobFile pic3) {
        this.pic3 = pic3;
    }

    public BmobFile getPic4() {
        return pic4;
    }

    public void setPic4(BmobFile pic4) {
        this.pic4 = pic4;
    }

    public BmobFile getPic5() {
        return pic5;
    }

    public void setPic5(BmobFile pic5) {
        this.pic5 = pic5;
    }

    public BmobFile getPic6() {
        return pic6;
    }

    public void setPic6(BmobFile pic6) {
        this.pic6 = pic6;
    }

    public BmobFile getPic7() {
        return pic7;
    }

    public void setPic7(BmobFile pic7) {
        this.pic7 = pic7;
    }

    public BmobFile getPic8() {
        return pic8;
    }

    public void setPic8(BmobFile pic8) {
        this.pic8 = pic8;
    }

    public BmobFile getPic9() {
        return pic9;
    }

    public void setPic9(BmobFile pic9) {
        this.pic9 = pic9;
    }

    public BmobFile getPic610() {
        return pic610;
    }

    public void setPic610(BmobFile pic610) {
        this.pic610 = pic610;
    }

    public String getGoods_pri() {
        return mGoods_pri;
    }

    public void setGoods_pri(String goods_pri) {
        mGoods_pri = goods_pri;
    }

    public String getGoods_classify() {
        return mGoods_classify;
    }

    public void setGoods_classify(String goods_classify) {
        mGoods_classify = goods_classify;
    }

    public String getGoods_des() {
        return mGoods_des;
    }

    public void setGoods_des(String goods_des) {
        mGoods_des = goods_des;
    }

    public String getGoodS_title() {
        return mGoodS_title;
    }

    public void setGoodS_title(String goodS_title) {
        mGoodS_title = goodS_title;
    }

}