package org.stones.reality.execution;

import java.sql.Connection;

public class ExplainPlanFactory {
	private static ExplainPlanFactory instance = new ExplainPlanFactory();

	private ExplainPlanFactory() {
		
	}

	public static ExplainPlanFactory getInstance() {
		return instance;
	}

	public IExplainPlan getExplainPlan(Connection con) {
		return new OracleExplainPlan(con);
	}
}
