/*
 * (c) 2015 Abil'I.T. http://abilit.eu/
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of 
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */
package org.scada_lts.mango.convert;

import org.apache.commons.lang3.tuple.MutablePair;
import org.scada_lts.dao.model.IdName;

import java.util.ArrayList;
import java.util.List;

/** 
 * @author grzegorz bylica Abil'I.T. development team, sdt@abilit.eu
 */
public class IdNameToIntValuePair {
	
	public static MutablePair<Integer, String> convert(IdName idName) {
		MutablePair<Integer, String> ivp2 = new MutablePair<>(idName.getId(), idName.getName());
		return ivp2;
	}
	
	public static List<MutablePair<Integer, String>> convert(List<IdName> lstIdName) {

		ArrayList<MutablePair<Integer, String>> list = new ArrayList<>();
		for (IdName idName: lstIdName) {
			list.add(convert(idName));
		}
		return list;
	}

}
