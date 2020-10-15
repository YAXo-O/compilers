namespace TenetCompiler.Visitors
{
	public class DefineConstVisitor: TenetBaseVisitor<string>
	{
		public override string VisitDefine_constant(TenetParser.Define_constantContext context)
		{
			var type = context.TYPE().GetText();
			var name = context.IDENTIFIER().GetText();
			var value = context.expression().GetText();

			return $"Constant definition; name: {name}, value: {value}, type: {type}";
		}
	}
}
