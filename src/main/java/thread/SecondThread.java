package thread;

import java.util.concurrent.BlockingQueue;
import vo.PageVo;


/**
 * 二号线程，爬取网页的关注量，名称，id等信息
 */
public class SecondThread implements Runnable
{
    BlockingQueue<PageVo> queue;

    public SecondThread(BlockingQueue<PageVo> queue)
    {
        this.queue=queue;
    }

    @Override
    public void run()
    {
        System.out.println("消费者消费了：");

    }
}
