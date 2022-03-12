package com.varconn.inc.campusdotcom.data.constant;

import com.varconn.inc.campusdotcom.api.ApiInterface;

public class AppConstant {

    public static final String EMPTY_STRING = "";
    public static final String BUNDLE_KEY_TITLE = "title";
    public static final String BUNDLE_KEY_MESSAGE = "message";
    public static final String BUNDLE_KEY_URL = "url";
    public static final String SAVE_TO = "WPNewZ";
    public static final String BUNDLE_FROM_PUSH = "from_push";
    public static final long SITE_CACHE_SIZE = 10 * 1024 * 1024;
    public static final String DOT = ".";

    public static final String NEW_NOTI = "new_notification";
    public static final String BUNDLE_KEY_DELETE_ALL_NOT = "delete_all_not";

    public static final String BUNDLE_KEY_YES = "yes";
    public static final String BUNDLE_KEY_NO = "no";
    public static final String BUNDLE_KEY_VIEW_ID = "view_id_text";
    public static final String BUNDLE_KEY_DIALOG_FRAGMENT = "dialog_fragment";
    public static final String BUNDLE_KEY_EXIT_OPTION = "exit";
    public static final String BUNDLE_KEY_DELETE_EACH_BOOKMARK = "delete_each_book";
    public static final String BUNDLE_KEY_DELETE_ALL_BOOKMARK = "delete_all_book";
    public static final String BUNDLE_KEY_CATEGORY_ID = "category_id";
    public static final String BUNDLE_KEY_CATEGORY_NAME = "category_name";
    public static final String BUNDLE_KEY_CATEGORY_LIST = "category_list";
    public static final String BUNDLE_KEY_SEARCH_TEXT = "search_text";
    public static final String BUNDLE_KEY_POST_ID = "post_id";
    public static final String BUNDLE_KEY_COMMENTS_LINK = "comments_link";
    public static final String BUNDLE_KEY_DIALOG_OPTION = "should_dialog_open";
    public static final int CLICK_COUNT = 6;

    public static final int ZERO_INDEX = 0;
    public static final int THIRD_INDEX = 3;
    public static final int BUNDLE_KEY_FEATURED_POST_ID = -2;
    public static final int BUNDLE_KEY_SEARCH_POST_ID = -3;


    public static final String TTS_LOCALE = "en_US";

    // replace by your site url
    //static String url = new MainActivity().getUrl();

    static String value = ApiInterface.myHash.get("BASE_URL");

    public static String BASE_URL = "BASE_URL";
    public static String BASE_NAME = "BASE_NAME";



    // notification constants
    public static final String PREF_NOTIFICATION = "perf_notification";
    public static final String PREF_FONT_SIZE = "pref_font_size";
    public static final String MY_PREFS = "MyPrefs";

    // CSS properties for post details page
    public static final String CSS_PROPERTIES = "<style>body{width:100%;margin:0;}img {max-width:100%;height:auto;} iframe{width:100%;}</style>";


    //list of websites

    //BMETRO
    public static final String bmetroURL= "https://www.bmetro.co.zw/";
    public static final String bmetroName= "B-Metro";

    //BULAWAYO24
    public static final String 	bulawayo24URL= "https://bulawayo24.com/";
    public static final String bulawayo24Name= "Bulawayo24";

    //CRONICLE
    public static final String chronicleURL= "https://www.chronicle.co.zw/";
    public static final String chronicleName= "Chronicle";

    //DAILYNEWS
    public static final String dailynewsURL= "https://dailynews.co.zw/";
    public static final String dailynewsName= "Daily News";

    //H-METRO
    public static final String hmetroURL= "https://www.hmetro.co.zw/";
    public static final String hmetroName= "H-Metro";

    //HERALD
    public static final String heraldURL= "https://www.herald.co.zw/";
    public static final String heraldName= "The Herald";

    //iHARARE
    public static final String iharareURL= "https://iharare.com/";
    public static final String iharareName= "iHarare";

    //KWAYEDZA
    public static final String kwayedzaURL= "https://www.kwayedza.co.zw/";
    public static final String kwayedzaName= "Kwayedza";

    //MANICAPOST
    public static final String manicapostURL= "https://www.manicapost.co.zw/";
    public static final String manicapostName= "Manica Post";

    //MASVINGO MIRROR
    public static final String masvingomirrorURL= "http://www.masvingomirror.com/";
    public static final String masvingomirrorName= "Masvingo Mirror";

    //My Zimbabwe
    public static final String myzimbabweURL= "https://www.myzimbabwe.co.zw/";
    public static final String myzimbabweName= "My Zimbabwe";

    //NEWSDAY
    public static final String newsdayURL= "https://www.newsday.co.zw/";
    public static final String newsdayName= "Newsday";

    //PATRIOT
    public static final String patriotURL= "https://www.thepatriot.co.zw/";
    public static final String patriotName= "Patriot";

    //SOUTHERN EYE
    public static final String southerneyeURL= "http://www.southerneye.co.zw/";
    public static final String southerneyeName= "Southern Eye";

    //SUNDAY MAIL
    public static final String sundaymailURL= "https://www.sundaymail.co.zw/";
    public static final String sundaymailName= "Sunday Mail";

    //SUNDAY NEWS
    public static final String sundaynewsURL= "https://www.sundaynews.co.zw/";
    public static final String sundaynewsName= "Sunday News";

    //TECHZIM
    public static final String techzimURL= "https://www.techzim.co.zw/";
    public static final String techzimName= "Tech Zim";

    //THE STANDARD
    public static final String thestandardURL= "https://www.thestandard.co.zw/";
    public static final String thestandardName= "The Standard";

    //ZBC NEWS
    public static final String 	zbcnewsURL= "https://bulawayo24.com/";
    public static final String zbcnewsName= "ZBC News";

    //ZimEye
    public static final String zimeyeURL= "https://www.zimeye.net/";
    public static final String zimeyeName= "Zim Eye";


}
