package VBA;

public class ErrObject extends PrintStream {
	PrintStream myErr = System.err();
	public void Raise(int i) {
		throw Conversion.CVErr(i);
	}
}
/*
AclNotFoundException, 
ActivationException, 
AlreadyBoundException, 
ApplicationException, 
AWTException, 
BackingStoreException, 
BadAttributeValueExpException, 
BadBinaryOpValueExpException, 
BadLocationException, 
BadStringOperationException, 
BrokenBarrierException, 
CertificateException, 
ClassNotFoundException, 
CloneNotSupportedException, 
DataFormatException, 
DatatypeConfigurationException, 
DestroyFailedException, 
ExecutionException, 
ExpandVetoException, 
FontFormatException, 
GeneralSecurityException, 
GSSException, 
IllegalAccessException, 
IllegalClassFormatException, 
InstantiationException, 
InterruptedException, 
IntrospectionException, 
InvalidApplicationException, 
InvalidMidiDataException, 
InvalidPreferencesFormatException, 
InvalidTargetObjectTypeException, 
InvocationTargetException, 
IOException, 
JMException, 
LastOwnerException, 
LineUnavailableException, 
MidiUnavailableException, 
MimeTypeParseException, 
NamingException, 
NoninvertibleTransformException, 
NoSuchFieldException, 
NoSuchMethodException, 
NotBoundException, 
NotOwnerException, 
ParseException, 
ParserConfigurationException, 
PrinterException, 
PrintException, 
PrivilegedActionException, 
PropertyVetoException, 
RefreshFailedException, �
RemarshalException, 
RuntimeException, 
SAXException, 
ServerNotActiveException, 
SQLException, 
TimeoutException, 
TooManyListenersException, 
TransformerException, 
UnmodifiableClassException, 
UnsupportedAudioFileException, 
UnsupportedCallbackException, 
UnsupportedFlavorException, 
UnsupportedLookAndFeelException, 
URISyntaxException, 
UserException, 
XAException, 
XMLParseException, 
XPathException 
*/