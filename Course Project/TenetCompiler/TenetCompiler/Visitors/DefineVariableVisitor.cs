namespace TenetCompiler.Visitors
{
	public enum VariableType
	{
		Real = 0,
		Int = 1,
		String = 2,
	}

	public class DefineVariableVisitor: TenetBaseVisitor<string>
	{
		private string Name { get; set; }
		private string Value { get; set; }
		private VariableType Type { get; set; }

		public override string VisitDefine_variable(TenetParser.Define_variableContext context)
		{
			string type = context.TYPE().GetText();
			string name = context.IDENTIFIER().GetText();
			string value = context.expression().GetText();

			return $"Variable definition; Type: {type}, name: {name}, value: {value}";
		}
	}
}
