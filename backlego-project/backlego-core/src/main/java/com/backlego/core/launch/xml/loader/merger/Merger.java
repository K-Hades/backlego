/*
* 文 件 名: Merger.java
* 版 权: xxx., Ltd. Copyright 2015-2015, All rights reserved
* 描 述: <描述>
* 修 改 人:Administrator
* 修改时间: 2015-9-9
* 跟踪单号: <跟踪单号>
* 修改单号: <修改单号>
* 修改内容:<修改内容>
*/
package com.backlego.core.launch.xml.loader.merger;

import java.util.List;

/**
* <一句话功能简述>
* <功能详细描述>
*
* @author Administrator
* @version [版本号, 2015-9-9]
*/
public interface Merger<T>
{
    public T merge(List<T> objects);
    
    public T merge(T object1, T object2);
}

	