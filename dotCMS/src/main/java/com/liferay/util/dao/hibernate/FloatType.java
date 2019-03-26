/**
 * Copyright (c) 2000-2005 Liferay, LLC. All rights reserved.
 *
 * <p>Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * <p>The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * <p>THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.liferay.util.dao.hibernate;

import com.dotcms.repackage.net.sf.hibernate.Hibernate;
import com.dotcms.repackage.net.sf.hibernate.HibernateException;
import com.dotcms.repackage.net.sf.hibernate.UserType;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * <a href="FloatType.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 * @version $Revision: 1.4 $
 */
public class FloatType implements UserType {

  public static final float DEFAULT_VALUE = 0.0F;

  public static final int[] SQL_TYPES = new int[] {java.sql.Types.FLOAT};

  public Object deepCopy(Object obj) {
    return obj;
  }

  public boolean equals(Object x, Object y) {
    if (x == y) {
      return true;
    } else if (x == null || y == null) {
      return false;
    } else {
      return x.equals(y);
    }
  }

  public boolean isMutable() {
    return false;
  }

  public Object nullSafeGet(ResultSet rs, String[] names, Object obj)
      throws HibernateException, SQLException {

    Float value = (Float) Hibernate.FLOAT.nullSafeGet(rs, names[0]);

    if (value == null) {
      return new Float(DEFAULT_VALUE);
    } else {
      return value;
    }
  }

  public void nullSafeSet(PreparedStatement ps, Object obj, int index)
      throws HibernateException, SQLException {

    if (obj == null) {
      obj = new Float(DEFAULT_VALUE);
    }

    Hibernate.FLOAT.nullSafeSet(ps, obj, index);
  }

  public Class returnedClass() {
    return Float.class;
  }

  public int[] sqlTypes() {
    return SQL_TYPES;
  }
}
