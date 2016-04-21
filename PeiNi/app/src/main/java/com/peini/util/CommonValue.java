package com.peini.util;

import com.peini.bean.LocationInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fuhao on 16/4/11.
 */
public class CommonValue {
    public static String SP_login = "sp_login";
    public static List<LocationInfo> locationList = new ArrayList<>();

    public static void init() {
        initLocationList();
    }
    public static void initLocationList() {
        LocationInfo info1 = new LocationInfo();
        info1.setIntroduction("看过台湾许多的电影，《艋舺》、《一页台北》、《不能说的秘密》等等，你是否也向往化身成为电影主角，眼上一段属于自己的完美电影，每天都到不同的电影拍摄景点，来考验你对台湾电影的了解，是否一眼就能看出拍摄的场景是甚么！");
        info1.setName("台湾疯电影九日游");
        locationList.add(info1);

        LocationInfo info2 = new LocationInfo();
        info2.setIntroduction("台湾实际停留时间最长为16天15晚，环岛推荐从交通便利的西部开始，即逆时针环岛。包括了台湾大部分重要城市和风景区，能全面的了解一个真实的台湾。");
        info2.setName("台湾环岛15日经典玩法");
        locationList.add(info2);

        LocationInfo info3 = new LocationInfo();
        info3.setIntroduction("经过日月潭和阿里山的经典线路，能欣赏到台湾中部山脉和绝美日出。因交通不便使得行程略微紧张，在台北的游玩时间被减少。");
        info3.setName("台湾阿里山日月潭玩法");
        locationList.add(info3);

        LocationInfo info4 = new LocationInfo();
        info4.setIntroduction("3天台北+九份，1天高雄，3天垦丁，7日的行程，把台湾两大城市和属于青春偶像剧的垦丁海岸走遍！还有独特的夜宿海洋馆体验哦。");
        info4.setName("台北+高雄+垦丁7日全方位立体深度游");
        locationList.add(info4);

        LocationInfo info5 = new LocationInfo();
        info5.setIntroduction("带你发现台湾的离岛之美！在这里不仅可以享受碧海蓝天、星斗点点，兰屿的原住民文化、绿岛的人权史事，更为旅程增添上人文知性味道，绝对让你不虚此行！");
        info5.setName("悠游绿岛+兰屿双岛3日游");
        locationList.add(info5);

        LocationInfo info6 = new LocationInfo();
        info6.setIntroduction("在垦丁大街租一辆电动车，和台湾当地人一样，沿着太平洋骑行，发现东亚之光灯塔，国境之南，关山落日，最后回到垦丁大街，在夜市结束一天的旅行");
        info6.setName("阳光海风 浪漫海滩垦丁机车1日游");
        locationList.add(info6);
    }
}
