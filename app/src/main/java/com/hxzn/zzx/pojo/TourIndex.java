package com.hxzn.zzx.pojo;

import java.util.List;

/**
 * Created by pf.
 * description:
 * 包名:cn.xiaohuodui.hark.model.pojo
 */

public class TourIndex {

    @Override
    public String toString() {
        return "TourIndex{" +
                "share=" + share +
                ", slide=" + slide +
                ", keywords=" + keywords +
                ", categories=" + categories +
                ", guides=" + guides +
                ", sceneries=" + sceneries +
                '}';
    }

    /**
         * slide : [{"title":"赏鲸","link":"harkhark://app/product/show?id=49","cover":"http://travel.harkhark.com.au/uploads/2018/05/10/201805101210160000003372.jpg"},{"title":"墨尔本艺术展","link":"harkhark://app/product/show?id=875","cover":"http://travel.harkhark.com.au/uploads/2018/05/24/201805241528210000003538.jpg"},{"title":"sunset 系列海岛一日游两日游7-8月特惠","link":"harkhark://app/product/show?id=910","cover":"http://travel.harkhark.com.au/uploads/2018/06/15/201806151720450000005758.jpg"},{"title":"凯恩斯天空之境","link":"harkhark://app/product/show?id=705","cover":"http://travel.harkhark.com.au/uploads/2017/12/18/201712181351310000001392.jpg"},{"title":"凯恩斯","link":"harkhark://app/search/list?keyword=凯恩斯&index=1","cover":"http://travel.harkhark.com.au/uploads/2018/05/02/201805021358140000002234.JPG"}]
         * keywords : [{"title":"Vivid悉尼灯光音乐节","link":"harkhark://app/search/list?keyword=[5/25-6/16]&index=1"},{"title":"小野丽莎","link":"harkhark://app/product/show?id=768"},{"title":"高空跳伞","link":"harkhark://app/search/list?keyword=高空跳伞&index=1"},{"title":"接送机","link":"harkhark://app/search/list?keyword=接送机&index=1"},{"title":"中文团","link":"harkhark://app/product/show?id=237"}]
         * categories : [{"title":"兴趣体验","link":"harkhark://app/product/list?category_id=61","cover":"http://travel.harkhark.com.au/uploads/2018/04/12/201804121710250000009509.png"},{"title":"接机/送机","link":"harkhark://app/product/list?category_id=47","cover":"http://travel.harkhark.com.au/uploads/2016/08/29/201608291629580000002274.png"},{"title":"景点门票","link":"harkhark://app/product/list?category_id=35","cover":"http://travel.harkhark.com.au/uploads/2016/08/29/201608291622460000008403.png"},{"title":"自助餐","link":"harkhark://app/product/list?category_id=41","cover":"http://travel.harkhark.com.au/uploads/2016/08/29/201608291627490000004454.png"},{"title":"一日游","link":"harkhark://app/product/list?category_id=36","cover":"http://travel.harkhark.com.au/uploads/2016/08/29/201608291627330000005345.png"},{"title":"海豚岛","link":"harkhark://app/search/list?keyword=海豚岛&index=1","cover":"http://travel.harkhark.com.au/uploads/2016/11/30/201611301039440000008718.png"},{"title":"极限运动","link":"harkhark://app/search/list?keyword=极限&index=1","cover":"http://travel.harkhark.com.au/uploads/2016/11/29/201611291744050000009036.png"},{"title":"家庭出行","link":"harkhark://app/search/list?keyword=家庭出行&index=1","cover":"http://travel.harkhark.com.au/uploads/2016/11/30/201611301004480000002631.png"},{"title":"周末出行","link":"harkhark://app/search/list?keyword=周末出行&index=1","cover":"http://travel.harkhark.com.au/uploads/2016/11/30/201611301008500000007781.png"},{"title":"户外活动","link":"harkhark://app/product/list?category_id=39","cover":"http://travel.harkhark.com.au/uploads/2016/08/29/201608291628460000006625.png"},{"title":"旅游景点","link":"harkhark://app/scenery/list","cover":"http://travel.harkhark.com.au/uploads/2016/08/29/201608291631030000001670.png"},{"title":"毕业游","link":"harkhark://app/search/list?keyword=毕业&index=1","cover":"http://travel.harkhark.com.au/uploads/2016/08/29/201608291629400000009378.png"},{"title":"出行攻略","link":"harkhark://app/guide/list","cover":"http://travel.harkhark.com.au/uploads/2016/08/29/201608291630500000009039.png"}]
         * guides : [{"title":"＃实用贴＃凯恩斯怎么玩？最全大堡礁游船攻略！","link":"harkhark://app/guide/show?id=160","cover":"http://travel.harkhark.com.au/uploads/2017/11/21/201711211358210000008919.jpg","avatar":"http://travel.harkhark.com.au/admin/img/avatars/guide/nuannuan.jpg"},{"title":"＃舌尖上的黄金海岸＃吃货必尝的海鲜自助餐厅大汇总","link":"harkhark://app/guide/show?id=162","cover":"http://travel.harkhark.com.au/uploads/2017/11/21/201711211405010000005715.jpg","avatar":"http://travel.harkhark.com.au/admin/img/avatars/guide/nuannuan.jpg"},{"title":"邦德堡遇见小海龟","link":"harkhark://app/guide/show?id=163","cover":"http://travel.harkhark.com.au/uploads/2017/11/21/201711211406130000004171.jpg","avatar":"http://travel.harkhark.com.au/admin/img/avatars/guide/nuannuan.jpg"},{"title":"＃跳伞促销＃澳洲人气最高的高空跳伞点，你选哪里？","link":"harkhark://app/guide/show?id=161","cover":"http://travel.harkhark.com.au/uploads/2017/11/21/201711211403190000005365.jpg","avatar":"http://travel.harkhark.com.au/admin/img/avatars/guide/nuannuan.jpg"},{"title":"史上最全澳洲机场退税攻略","link":"harkhark://app/guide/show?id=137","cover":"http://travel.harkhark.com.au/uploads/2016/11/11/201611111038040000008737.jpg","avatar":"http://travel.harkhark.com.au/admin/img/avatars/guide/hezudao.jpg"},{"title":"2017HarkHark旅游盘点-澳大利亚热气球哪个地方飞行最美","link":"harkhark://app/guide/show?id=141","cover":"http://travel.harkhark.com.au/uploads/2016/12/29/201612291145380000005949.jpg","avatar":"http://travel.harkhark.com.au/admin/img/avatars/guide/nuannuan.jpg"},{"title":"在黄金海岸必做的十件事","link":"harkhark://app/guide/show?id=76","cover":"http://travel.harkhark.com.au/uploads/2016/05/12/20160512150054000000_1_204788_61.jpg","avatar":"http://travel.harkhark.com.au/admin/img/avatars/guide/feitian090.png"},{"title":"那些稀奇古怪的餐厅\u2014\u2014请你去你都未必敢去","link":"harkhark://app/guide/show?id=126","cover":"http://travel.harkhark.com.au/uploads/2016/09/29/201609291529010000009892.jpg","avatar":"http://travel.harkhark.com.au/admin/img/avatars/guide/longxing.png"},{"title":"文化生活-墨尔本博物馆之旅","link":"harkhark://app/guide/show?id=68","cover":"http://travel.harkhark.com.au/uploads/2016/05/05/20160505082312000000_1_117431_8.jpg","avatar":"http://travel.harkhark.com.au/admin/img/avatars/guide/weiluonikayushuangshenghua.jpg"}]
         * sceneries : [{"title":"凯恩斯","link":"harkhark://app/search/list?keyword=凯恩斯&index=1","cover":"http://travel.harkhark.com.au/uploads/2017/11/01/201711011514280000007117.jpg","summary":"海底总动员"},{"title":"墨尔本","link":"harkhark://app/scenery/list?destination_id=18","cover":"http://travel.harkhark.com.au/uploads/2017/12/05/201712051602340000004125.jpg","summary":"澳网"},{"title":"悉尼","link":"harkhark://app/scenery/list?destination_id=16","cover":"http://travel.harkhark.com.au/uploads/2017/12/05/201712051559070000003649.jpg","summary":"繁华都市"},{"title":"珀斯","link":"harkhark://app/scenery/list?destination_id=22","cover":"http://travel.harkhark.com.au/uploads/2017/09/12/201709121318520000004735.jpg","summary":"最独孤的城市"},{"title":"阿德莱德","link":"harkhark://app/scenery/list?destination_id=20","cover":"http://travel.harkhark.com.au/uploads/2017/09/12/201709121326520000008867.jpg","summary":"南澳游玩推荐"},{"title":"霍巴特","link":"harkhark://app/scenery/list?destination_id=27","cover":"http://travel.harkhark.com.au/uploads/2017/12/05/201712051607350000003579.jpg","summary":"钟情塔州"}]
         * share : {"title":"HarkHark旅游","desc":"HarkHark旅游","cover":"http://travel.harkhark.com.au/images/default/general_2.png","link":"http://travel.harkhark.com.au/"}
         */

        private ShareBean share;
        private List<SlideBean> slide;
        private List<KeywordsBean> keywords;
        private List<CategoriesBean> categories;
        private List<GuidesBean> guides;
        private List<SceneriesBean> sceneries;

        public ShareBean getShare() {
            return share;
        }

        public void setShare(ShareBean share) {
            this.share = share;
        }

        public List<SlideBean> getSlide() {
            return slide;
        }

        public void setSlide(List<SlideBean> slide) {
            this.slide = slide;
        }

        public List<KeywordsBean> getKeywords() {
            return keywords;
        }

        public void setKeywords(List<KeywordsBean> keywords) {
            this.keywords = keywords;
        }

        public List<CategoriesBean> getCategories() {
            return categories;
        }

        public void setCategories(List<CategoriesBean> categories) {
            this.categories = categories;
        }

        public List<GuidesBean> getGuides() {
            return guides;
        }

        public void setGuides(List<GuidesBean> guides) {
            this.guides = guides;
        }

        public List<SceneriesBean> getSceneries() {
            return sceneries;
        }

        public void setSceneries(List<SceneriesBean> sceneries) {
            this.sceneries = sceneries;
        }







}
