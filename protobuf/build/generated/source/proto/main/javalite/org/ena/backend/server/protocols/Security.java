// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: security.proto

package de.rki.coronawarnapp.server.protocols;

public final class Security {
    static {
    }

    private Security() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public interface SignedPayloadOrBuilder extends
            // @@protoc_insertion_point(interface_extends:de.rki.coronawarnapp.server.protocols.SignedPayload)
            com.google.protobuf.MessageLiteOrBuilder {

        /**
         * <pre>
         * serialized Payload message
         * </pre>
         *
         * <code>optional bytes payload = 1;</code>
         */
        com.google.protobuf.ByteString getPayload();

        /**
         * <pre>
         * X509 certificate chain
         * </pre>
         *
         * <code>optional bytes certificateChain = 2;</code>
         */
        com.google.protobuf.ByteString getCertificateChain();

        /**
         * <pre>
         * signature of payload
         * </pre>
         *
         * <code>optional bytes signature = 3;</code>
         */
        com.google.protobuf.ByteString getSignature();
    }

    /**
     * Protobuf type {@code de.rki.coronawarnapp.server.protocols.SignedPayload}
     */
    public static final class SignedPayload extends
            com.google.protobuf.GeneratedMessageLite<
                    SignedPayload, SignedPayload.Builder> implements
            // @@protoc_insertion_point(message_implements:de.rki.coronawarnapp.server.protocols.SignedPayload)
            SignedPayloadOrBuilder {
        public static final int PAYLOAD_FIELD_NUMBER = 1;
        public static final int CERTIFICATECHAIN_FIELD_NUMBER = 2;
        public static final int SIGNATURE_FIELD_NUMBER = 3;
        // @@protoc_insertion_point(class_scope:de.rki.coronawarnapp.server.protocols.SignedPayload)
        private static final de.rki.coronawarnapp.server.protocols.Security.SignedPayload DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<SignedPayload> PARSER;

        static {
            DEFAULT_INSTANCE = new SignedPayload();
            DEFAULT_INSTANCE.makeImmutable();
        }

        private com.google.protobuf.ByteString payload_;
        private com.google.protobuf.ByteString certificateChain_;
        private com.google.protobuf.ByteString signature_;

        private SignedPayload() {
            payload_ = com.google.protobuf.ByteString.EMPTY;
            certificateChain_ = com.google.protobuf.ByteString.EMPTY;
            signature_ = com.google.protobuf.ByteString.EMPTY;
        }

        public static de.rki.coronawarnapp.server.protocols.Security.SignedPayload parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return com.google.protobuf.GeneratedMessageLite.parseFrom(
                    DEFAULT_INSTANCE, data);
        }

        public static de.rki.coronawarnapp.server.protocols.Security.SignedPayload parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return com.google.protobuf.GeneratedMessageLite.parseFrom(
                    DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static de.rki.coronawarnapp.server.protocols.Security.SignedPayload parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return com.google.protobuf.GeneratedMessageLite.parseFrom(
                    DEFAULT_INSTANCE, data);
        }

        public static de.rki.coronawarnapp.server.protocols.Security.SignedPayload parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return com.google.protobuf.GeneratedMessageLite.parseFrom(
                    DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static de.rki.coronawarnapp.server.protocols.Security.SignedPayload parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageLite.parseFrom(
                    DEFAULT_INSTANCE, input);
        }

        public static de.rki.coronawarnapp.server.protocols.Security.SignedPayload parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageLite.parseFrom(
                    DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static de.rki.coronawarnapp.server.protocols.Security.SignedPayload parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static de.rki.coronawarnapp.server.protocols.Security.SignedPayload parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static de.rki.coronawarnapp.server.protocols.Security.SignedPayload parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageLite.parseFrom(
                    DEFAULT_INSTANCE, input);
        }

        public static de.rki.coronawarnapp.server.protocols.Security.SignedPayload parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageLite.parseFrom(
                    DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(de.rki.coronawarnapp.server.protocols.Security.SignedPayload prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public static de.rki.coronawarnapp.server.protocols.Security.SignedPayload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<SignedPayload> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /**
         * <pre>
         * serialized Payload message
         * </pre>
         *
         * <code>optional bytes payload = 1;</code>
         */
        public com.google.protobuf.ByteString getPayload() {
            return payload_;
        }

        /**
         * <pre>
         * serialized Payload message
         * </pre>
         *
         * <code>optional bytes payload = 1;</code>
         */
        private void setPayload(com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }

            payload_ = value;
        }

        /**
         * <pre>
         * serialized Payload message
         * </pre>
         *
         * <code>optional bytes payload = 1;</code>
         */
        private void clearPayload() {

            payload_ = getDefaultInstance().getPayload();
        }

        /**
         * <pre>
         * X509 certificate chain
         * </pre>
         *
         * <code>optional bytes certificateChain = 2;</code>
         */
        public com.google.protobuf.ByteString getCertificateChain() {
            return certificateChain_;
        }

        /**
         * <pre>
         * X509 certificate chain
         * </pre>
         *
         * <code>optional bytes certificateChain = 2;</code>
         */
        private void setCertificateChain(com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }

            certificateChain_ = value;
        }

        /**
         * <pre>
         * X509 certificate chain
         * </pre>
         *
         * <code>optional bytes certificateChain = 2;</code>
         */
        private void clearCertificateChain() {

            certificateChain_ = getDefaultInstance().getCertificateChain();
        }

        /**
         * <pre>
         * signature of payload
         * </pre>
         *
         * <code>optional bytes signature = 3;</code>
         */
        public com.google.protobuf.ByteString getSignature() {
            return signature_;
        }

        /**
         * <pre>
         * signature of payload
         * </pre>
         *
         * <code>optional bytes signature = 3;</code>
         */
        private void setSignature(com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }

            signature_ = value;
        }

        /**
         * <pre>
         * signature of payload
         * </pre>
         *
         * <code>optional bytes signature = 3;</code>
         */
        private void clearSignature() {

            signature_ = getDefaultInstance().getSignature();
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (!payload_.isEmpty()) {
                output.writeBytes(1, payload_);
            }
            if (!certificateChain_.isEmpty()) {
                output.writeBytes(2, certificateChain_);
            }
            if (!signature_.isEmpty()) {
                output.writeBytes(3, signature_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (!payload_.isEmpty()) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(1, payload_);
            }
            if (!certificateChain_.isEmpty()) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(2, certificateChain_);
            }
            if (!signature_.isEmpty()) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(3, signature_);
            }
            memoizedSerializedSize = size;
            return size;
        }

        protected final Object dynamicMethod(
                com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
                Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE: {
                    return new de.rki.coronawarnapp.server.protocols.Security.SignedPayload();
                }
                case IS_INITIALIZED: {
                    return DEFAULT_INSTANCE;
                }
                case MAKE_IMMUTABLE: {
                    return null;
                }
                case NEW_BUILDER: {
                    return new Builder();
                }
                case VISIT: {
                    Visitor visitor = (Visitor) arg0;
                    de.rki.coronawarnapp.server.protocols.Security.SignedPayload other = (de.rki.coronawarnapp.server.protocols.Security.SignedPayload) arg1;
                    payload_ = visitor.visitByteString(payload_ != com.google.protobuf.ByteString.EMPTY, payload_,
                            other.payload_ != com.google.protobuf.ByteString.EMPTY, other.payload_);
                    certificateChain_ = visitor.visitByteString(certificateChain_ != com.google.protobuf.ByteString.EMPTY, certificateChain_,
                            other.certificateChain_ != com.google.protobuf.ByteString.EMPTY, other.certificateChain_);
                    signature_ = visitor.visitByteString(signature_ != com.google.protobuf.ByteString.EMPTY, signature_,
                            other.signature_ != com.google.protobuf.ByteString.EMPTY, other.signature_);
                    if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
                            .INSTANCE) {
                    }
                    return this;
                }
                case MERGE_FROM_STREAM: {
                    com.google.protobuf.CodedInputStream input =
                            (com.google.protobuf.CodedInputStream) arg0;
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry =
                            (com.google.protobuf.ExtensionRegistryLite) arg1;
                    try {
                        boolean done = false;
                        while (!done) {
                            int tag = input.readTag();
                            switch (tag) {
                                case 0:
                                    done = true;
                                    break;
                                default: {
                                    if (!input.skipField(tag)) {
                                        done = true;
                                    }
                                    break;
                                }
                                case 10: {

                                    payload_ = input.readBytes();
                                    break;
                                }
                                case 18: {

                                    certificateChain_ = input.readBytes();
                                    break;
                                }
                                case 26: {

                                    signature_ = input.readBytes();
                                    break;
                                }
                            }
                        }
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        throw new RuntimeException(e.setUnfinishedMessage(this));
                    } catch (java.io.IOException e) {
                        throw new RuntimeException(
                                new com.google.protobuf.InvalidProtocolBufferException(
                                        e.getMessage()).setUnfinishedMessage(this));
                    } finally {
                    }
                }
                case GET_DEFAULT_INSTANCE: {
                    return DEFAULT_INSTANCE;
                }
                case GET_PARSER: {
                    if (PARSER == null) {
                        synchronized (de.rki.coronawarnapp.server.protocols.Security.SignedPayload.class) {
                            if (PARSER == null) {
                                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            }
                        }
                    }
                    return PARSER;
                }
            }
            throw new UnsupportedOperationException();
        }

        /**
         * Protobuf type {@code de.rki.coronawarnapp.server.protocols.SignedPayload}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageLite.Builder<
                        de.rki.coronawarnapp.server.protocols.Security.SignedPayload, Builder> implements
                // @@protoc_insertion_point(builder_implements:de.rki.coronawarnapp.server.protocols.SignedPayload)
                de.rki.coronawarnapp.server.protocols.Security.SignedPayloadOrBuilder {
            // Construct using de.rki.coronawarnapp.server.protocols.Security.SignedPayload.newBuilder()
            private Builder() {
                super(DEFAULT_INSTANCE);
            }


            /**
             * <pre>
             * serialized Payload message
             * </pre>
             *
             * <code>optional bytes payload = 1;</code>
             */
            public com.google.protobuf.ByteString getPayload() {
                return instance.getPayload();
            }

            /**
             * <pre>
             * serialized Payload message
             * </pre>
             *
             * <code>optional bytes payload = 1;</code>
             */
            public Builder setPayload(com.google.protobuf.ByteString value) {
                copyOnWrite();
                instance.setPayload(value);
                return this;
            }

            /**
             * <pre>
             * serialized Payload message
             * </pre>
             *
             * <code>optional bytes payload = 1;</code>
             */
            public Builder clearPayload() {
                copyOnWrite();
                instance.clearPayload();
                return this;
            }

            /**
             * <pre>
             * X509 certificate chain
             * </pre>
             *
             * <code>optional bytes certificateChain = 2;</code>
             */
            public com.google.protobuf.ByteString getCertificateChain() {
                return instance.getCertificateChain();
            }

            /**
             * <pre>
             * X509 certificate chain
             * </pre>
             *
             * <code>optional bytes certificateChain = 2;</code>
             */
            public Builder setCertificateChain(com.google.protobuf.ByteString value) {
                copyOnWrite();
                instance.setCertificateChain(value);
                return this;
            }

            /**
             * <pre>
             * X509 certificate chain
             * </pre>
             *
             * <code>optional bytes certificateChain = 2;</code>
             */
            public Builder clearCertificateChain() {
                copyOnWrite();
                instance.clearCertificateChain();
                return this;
            }

            /**
             * <pre>
             * signature of payload
             * </pre>
             *
             * <code>optional bytes signature = 3;</code>
             */
            public com.google.protobuf.ByteString getSignature() {
                return instance.getSignature();
            }

            /**
             * <pre>
             * signature of payload
             * </pre>
             *
             * <code>optional bytes signature = 3;</code>
             */
            public Builder setSignature(com.google.protobuf.ByteString value) {
                copyOnWrite();
                instance.setSignature(value);
                return this;
            }

            /**
             * <pre>
             * signature of payload
             * </pre>
             *
             * <code>optional bytes signature = 3;</code>
             */
            public Builder clearSignature() {
                copyOnWrite();
                instance.clearSignature();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:de.rki.coronawarnapp.server.protocols.SignedPayload)
        }
    }

    // @@protoc_insertion_point(outer_class_scope)
}
