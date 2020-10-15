namespace TenetCompiler.Visitors
{
	public class ExpressionVisitor: TenetBaseVisitor<string>
	{
		public override string VisitExpression(TenetParser.ExpressionContext context)
		{
			return base.VisitExpression(context);
		}
	}
}
