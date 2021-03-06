/******************************************************************************
* ~ Copyright (c) 2018 [jasonandy@hotmail.com | https://github.com/Jasonandy] *
* ~                                                                           *
* ~ Licensed under the Apache License, Version 2.0 (the "License”);           * 
* ~ you may not use this file except in compliance with the License.          *
* ~ You may obtain a copy of the License at                                   *
* ~                                                                           *
* ~    http://www.apache.org/licenses/LICENSE-2.0                             *
* ~                                                                           *
* ~ Unless required by applicable law or agreed to in writing, software       *
* ~ distributed under the License is distributed on an "AS IS" BASIS,         *
* ~ WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  *
* ~ See the License for the specific language governing permissions and       *
* ~ limitations under the License.                                            *
******************************************************************************/
package cn.ucaner.leecode.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;

/**     
* @Package：cn.ucaner.leecode.listener   
* @ClassName：ApplicationContextListener   
* @Description：   <p> ApplicationContextListener </p>
* @Author： - Jason    
* @CreatTime：2019年1月24日 上午10:59:44   
* @Modify By：   
* @ModifyTime：  2019年1月24日
* @Modify marker：   
* @version    V1.0
*/
@Configuration
public class ApplicationContextListener implements ApplicationListener<ContextRefreshedEvent>{

	private static final Logger logger = LoggerFactory.getLogger(ApplicationContextListener.class);

	/**
	 * @Override
	 */
	public void onApplicationEvent(ContextRefreshedEvent event) {
		if(null == event.getApplicationContext().getParent()) {
			init();//初始化方法  可以用来初始化redis缓存等 .. 
			logger.info(">>>> 喜大普奔 恭喜您 您的容器Context初始化成功.<<<");
		 }
	}
	
	/**
	 * @Description: init() 初始化方法
	 * @Autor: Jason
	 */
	public void init() {
		logger.info("ApplicationContextListener - {}","INIT方法初始化成功!");
	}
		

}
