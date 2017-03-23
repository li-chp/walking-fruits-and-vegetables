/**
 * @(#)AutoConfig.java 2016年6月22日
 * Copyright 2016 Neusoft Group Ltd. All rights reserved.
 * Neusoft PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *******************************************************************************/
package test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author <a href="mailto:li-chp@neusoft.com"> li-chp </a>
 * @version $Revision 1.0.0 $ 2016年6月22日 下午2:42:11
 */
public class AutoConfig {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 0;
		
		while (num < 1000) {
			num++;
			Execute thread = new Execute(num);			
			new Thread(thread).start();;
		}

	}
	
	public static String toLongDateString(Date dt){
        SimpleDateFormat myFmt=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒SSS毫秒 ");       
        return myFmt.format(dt);
    }

	static class Execute implements Runnable  {
		public int num;
		
		@Override
		public void run() {
			System.out.println("now is " + toLongDateString(new Date()));	
			System.out.println("i'm thread " + num);
		}
		
		public Execute(int num) {
			this.num = num;
		}		
	}
}
