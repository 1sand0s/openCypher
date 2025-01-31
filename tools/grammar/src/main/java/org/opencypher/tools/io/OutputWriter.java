/*
 * Copyright (c) 2015-2022 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Attribution Notice under the terms of the Apache License 2.0
 *
 * This work was created by the collective efforts of the openCypher community.
 * Without limiting the terms of Section 6, any Derivative Work that is not
 * approved by the public consensus process of the openCypher Implementers Group
 * should not be described as “Cypher” (and Cypher® is a registered trademark of
 * Neo4j Inc.) or as "openCypher". Extensions by implementers or prototypes or
 * proposals for change that have been documented or implemented should only be
 * described as "implementation extensions to Cypher" or as "proposed changes to
 * Cypher that are not yet approved by the openCypher community".
 */
package org.opencypher.tools.io;

import java.io.Writer;

class OutputWriter extends Writer
{
    final Output output;

    OutputWriter( Output output )
    {
        this.output = output;
    }

    @Override
    public void write( char[] cbuf, int off, int len )
    {
        output.append( cbuf, off, len );
    }

    @Override
    public void write( int c )
    {
        output.append( (char) c );
    }

    @Override
    public void write( char[] cbuf )
    {
        output.append( cbuf );
    }

    @Override
    public void write( String str )
    {
        output.append( str );
    }

    @Override
    public void write( String str, int off, int len )
    {
        output.append( str, off, len );
    }

    @Override
    public Writer append( CharSequence csq )
    {
        output.append( csq );
        return this;
    }

    @Override
    public Writer append( CharSequence csq, int start, int end )
    {
        output.append( csq, start, end );
        return this;
    }

    @Override
    public Writer append( char c )
    {
        output.append( c );
        return this;
    }

    @Override
    public void flush()
    {
        output.flush();
    }

    @Override
    public void close()
    {
        output.close();
    }
}
