/*******************************************************************************
 * Copyright (c) 2010 Oracle.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution. 
 * The Eclipse Public License is available at
 *     http://www.eclipse.org/legal/epl-v10.html
 * and the Apache License v2.0 is available at 
 *     http://www.opensource.org/licenses/apache2.0.php.
 * You may elect to redistribute this code under either of these licenses.
 *
 * Contributors:
 *     mkeith - Gemini JPA tests 
 ******************************************************************************/
package model.weaved;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;

/**
 * Test JPA model class
 * 
 * @author mkeith
 */
@Entity
public class WeavedEntity {

    @Id
    int id;
    
    // Lazy fetching of a basic attribute will cause the entity to be woven
    @Basic(fetch=FetchType.LAZY) 
    String lazyString;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getLazyString() { return lazyString; }
    public void setLazyString(String lazyString) { this.lazyString = lazyString; }
}
