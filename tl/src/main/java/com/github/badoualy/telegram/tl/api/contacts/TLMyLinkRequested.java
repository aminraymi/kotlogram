
package com.github.badoualy.telegram.tl.api.contacts;


import com.github.badoualy.telegram.tl.TLContext;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import static com.github.badoualy.telegram.tl.StreamUtils.readTLBool;
import static com.github.badoualy.telegram.tl.StreamUtils.writeTLBool;



public class TLMyLinkRequested extends TLAbsMyLink {
    public static final int CLASS_ID = 0x6c69efee;

    public TLMyLinkRequested() {

    }


    public TLMyLinkRequested(        boolean _contact) {
        this.contact = _contact;

    }


    public int getClassId() {
        return CLASS_ID;
    }


    protected boolean contact;


    public boolean getContact() {
        return contact;
    }

    public void setContact(boolean value) {
        this.contact = value;
    }


    @Override
    public void serializeBody(OutputStream stream) throws IOException {

        writeTLBool(this.contact, stream);
    }


    @Override
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {

        this.contact = readTLBool(stream);
    }



    @Override
    public String toString() {
        return "contacts.myLinkRequested#6c69efee";
    }

}
