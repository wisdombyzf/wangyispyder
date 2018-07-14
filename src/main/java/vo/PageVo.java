package vo;

/**
 * 网易新闻自媒体值对象
 */
public class PageVo
{
    //自媒体id
    private String ID;
    //名称
    private String name;
    //简介or描述
    private String desc;
    //被关注数
    private String subnum;
    //头像url
    private String avatarsUrl;
    //该页面url
    private String url;


    public String getID()
    {
        return ID;
    }

    public void setID(String ID)
    {
        this.ID = ID;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDesc()
    {
        return desc;
    }

    public void setDesc(String desc)
    {
        this.desc = desc;
    }



    public String getAvatarsUrl()
    {
        return avatarsUrl;
    }

    public void setAvatarsUrl(String avatarsUrl)
    {
        this.avatarsUrl = avatarsUrl;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public String getSubnum()
    {
        return subnum;
    }

    public void setSubnum(String subnum)
    {
        this.subnum = subnum;
    }
}
