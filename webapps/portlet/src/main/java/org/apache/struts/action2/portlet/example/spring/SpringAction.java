/*
 * $Id$
 *
 * Copyright 2006 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.struts.action2.portlet.example.spring;

import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.opensymphony.xwork.ActionSupport;

/**
 */
public class SpringAction extends ActionSupport {
    
    private ThingManager thingManager = null;
    private String thing = null;
    
    public void setThingManager(ThingManager thingManager) {
        this.thingManager = thingManager;
    }
    
    public List getThings() {
        return thingManager.getThings();
    }
    
    public String getThing() {
        return thing;
    }
    
    public void setThing(String thing) {
        this.thing = thing;
    }
    
    public String execute() {
        if(StringUtils.isNotEmpty(thing)) {
            thingManager.addThing(thing);
        }
        return SUCCESS;
    }
}
