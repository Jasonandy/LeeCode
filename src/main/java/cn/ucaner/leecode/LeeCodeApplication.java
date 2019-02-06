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
package cn.ucaner.leecode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**     
* @Package：cn.ucaner.leecode   
* @ClassName：LeeCodeApplication   
* @Description：   <p> LeeCodeApplication - HappyNewYear2019 </p>
* @Author： - Jason    
* @CreatTime：2019年1月24日 上午10:49:07   
* @Modify By：   
* @ModifyTime：  2019年1月24日
* @Modify marker：   
* @version    V1.0
*/
@SpringBootApplication
public class LeeCodeApplication {
	
	/*************规范化提交信息***********************
	feat: 新功能
	fix: 修复问题
	docs: 修改文档
	style: 修改代码格式，不影响代码逻辑
	refactor: 重构代码，理论上不影响现有功能
	perf: 提升性能
	test: 增加修改测试用例
	chore: 修改工具相关（包括但不限于文档、代码生成等）
	deps: 升级依赖
	**************************************************/
	public static void main(String[] args) {
        SpringApplication.run(LeeCodeApplication.class, args);
    }
}
