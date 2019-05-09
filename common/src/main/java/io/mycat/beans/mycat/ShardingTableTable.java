/**
 * Copyright (C) <2019>  <chen junwen>
 *
 * This program is free software: you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this program.  If
 * not, see <http://www.gnu.org/licenses/>.
 */
package io.mycat.beans.mycat;

import io.mycat.config.schema.TableDefConfig;
import java.util.List;

/**
 * @author jamie12221
 * @date 2019-05-05 16:23
 **/
public class ShardingTableTable extends MycatTable {

  private final MycatTableRule rule;

  public ShardingTableTable(TableDefConfig tableDefConfig, List<String> dataNodes, MycatTableRule rule) {
    super(tableDefConfig, dataNodes);
    this.rule = rule;
  }

  public MycatTableRule getRule() {
    return rule;
  }

  public String getSubTable(int index){
   return this.getTableDefConfig().getSubTables().get(index);
  }
}
