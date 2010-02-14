package me.prettyprint.cassandra.model;

import java.util.Map;

import org.apache.thrift.TException;

import me.prettyprint.cassandra.service.CassandraClient;
import me.prettyprint.cassandra.service.CassandraClientFactory;
import me.prettyprint.cassandra.service.CassandraClient.FailoverPolicy;

/**
 *
 * @author Ran Tavory (rantav@gmail.com)
 *
 */
public class KeyspaceFactory {

  public Keyspace create(CassandraClient cassandraClient, String keyspaceName,
      Map<String, Map<String, String>> keyspaceDesc, int consistencyLevel,
      FailoverPolicy failoverPolicy, CassandraClientFactory clientFactory) throws TException {
    return new KeyspaceImpl(cassandraClient, keyspaceName, keyspaceDesc, consistencyLevel,
        failoverPolicy, clientFactory);
  }
}
